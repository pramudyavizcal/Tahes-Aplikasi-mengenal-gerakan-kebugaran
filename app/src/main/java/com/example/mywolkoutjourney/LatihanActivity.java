package com.example.mywolkoutjourney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.EditText;
import android.widget.SearchView;

import com.startapp.sdk.adsbase.StartAppAd;

import java.util.ArrayList;

public class LatihanActivity extends AppCompatActivity {
private RecyclerView recyclerView;

    private ArrayList<LatihanModel> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
        arrayList = new ArrayList<>();
        recyclerView = findViewById(R.id.myRecyclerView);
        final LatihanAdapter adapter = new LatihanAdapter(this);
        adapter.setList(Utils.getAllTrainings());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }


    @Override
    public void onBackPressed() {
        finish();
        StartAppAd.showAd(this);
    }
}
