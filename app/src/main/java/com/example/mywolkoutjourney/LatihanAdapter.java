package com.example.mywolkoutjourney;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class LatihanAdapter extends RecyclerView.Adapter<LatihanAdapter.MyViewHolder> {
    private ArrayList<LatihanModel> list = new ArrayList<>();
    private Context context;

    public LatihanAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout, parent, false);
        MyViewHolder hd = new MyViewHolder(view);
        return hd;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder,final int position) {
        holder.nama.setText(list.get(position).getNama());
        Glide.with(context).asBitmap().load(list.get(position).getGambar())
                .into(holder.gambar);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, LatihanDetail.class);
                intent.putExtra("Details", list.get(position));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nama;
        private TextView deskripsi;
        private ImageView gambar;
        private CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.namaLatihan);
            deskripsi = itemView.findViewById(R.id.deskripsiLatihan);
            gambar = itemView.findViewById(R.id.gambarLatihan);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
public void setList(ArrayList<LatihanModel> list){
        this.list = list;
}
}
