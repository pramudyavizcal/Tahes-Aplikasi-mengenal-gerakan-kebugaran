package com.example.mywolkoutjourney;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.icu.text.LocaleDisplayNames;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class EditActivity extends AppCompatActivity implements JadwalAdapter.OnDeletePlan{

    private Button addMore;
    private TextView planDay;
    private RecyclerView recyclerView;
    private JadwalAdapter adapter;
    private static final String TAG = "EditActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: EditActivity started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_jadwal);
        initViews();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.setType("Edit");
        recyclerView.setAdapter(adapter);
        Intent intent = getIntent();
        try{
            String day = intent.getStringExtra("Jadwalkan Hari");
            if(day!=null)
                planDay.setText(day);
            ArrayList<JadwalModel> editPlans = new ArrayList<>();
            for(JadwalModel plan : Utils.getUsersPlan()){
                if(plan.getDays().equals(day)){
                    editPlans.add(plan);
                }
            }
            adapter.setPlanList(editPlans);
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        addMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditActivity.this, LatihanActivity.class);
                startActivity(intent);
            }
        });
    }
    public void initViews(){
        planDay = findViewById(R.id.txtJadwal);
        addMore = findViewById(R.id.tambahjdwllatihanBtn);
        recyclerView = findViewById(R.id.editRecView);
        adapter = new JadwalAdapter(this);
    }

    @Override
    public void deletePlan(String day) {
        Log.d(TAG, "deletePlan: started");
        planDay.setText(day);
        ArrayList<JadwalModel> plans = new ArrayList<>();
        for(JadwalModel plan : Utils.getUsersPlan()){
            if(plan.getDays().equals(day))
                plans.add(plan);
        }
        adapter.setPlanList(plans);
    }


}