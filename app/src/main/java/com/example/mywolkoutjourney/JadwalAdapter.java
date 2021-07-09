package com.example.mywolkoutjourney;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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

public class JadwalAdapter extends RecyclerView.Adapter<JadwalAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<JadwalModel> jadwalList = new ArrayList<>();
    private String type = "";
    interface OnDeletePlan{
        public void deletePlan(String day);
    }
    private OnDeletePlan interfaceObject;

    public JadwalAdapter(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public JadwalAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.jadwal_list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull JadwalAdapter.MyViewHolder holder,final int position) {
        holder.namaLatihan.setText(jadwalList.get(position).getGym().getNama());
        holder.menit.setText(jadwalList.get(position).getMinutes()+" menit");
        Glide.with(context).asBitmap().load(jadwalList.get(position).getGym().getGambar())
        .into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(context,LatihanDetail.class);
              intent.putExtra("Details",jadwalList.get(position).getGym());
              context.startActivity(intent);
          }
      });
        try{
            interfaceObject = (OnDeletePlan) context;
        }catch(ClassCastException e){
            e.printStackTrace();
        }
        if (type.equals("Edit")){
            holder.cardView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    builder.setTitle("Hapus Jadwal");
                    builder.setMessage("Ingin menghapus jadwal latihan ini? "+jadwalList.get(position).getGym().getNama()+" dari "+jadwalList.get(position).getDays());
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Utils.removeUsersPlan(jadwalList.get(position));
                            interfaceObject.deletePlan(jadwalList.get(position).getDays());
                            notifyDataSetChanged();
                        }
                    });

                    builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    builder.create().show();
                    return true;
                }
            });

        }
    }

    @Override
    public int getItemCount() {
        return jadwalList.size();
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public void setPlanList(ArrayList<JadwalModel> jadwalList){           // passing planList planList
        this.jadwalList =  jadwalList;
    }

    public void setType(String type){
        this.type = type;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView namaLatihan;
        private ImageView imageView;
        private TextView menit;
        private ImageView enabled, desabled;
        private CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            namaLatihan = itemView.findViewById(R.id.namaLatihan);
            imageView = itemView.findViewById(R.id.imageView);
            menit = itemView.findViewById(R.id.menit);
            enabled = itemView.findViewById(R.id.enabled);
            desabled = itemView.findViewById(R.id.desabled);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
