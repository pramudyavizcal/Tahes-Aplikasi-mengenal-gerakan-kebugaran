package com.example.mywolkoutjourney;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
public class JadwalActivity extends AppCompatActivity {

    private RelativeLayout noPlanJadwalLayout;
    private Button tambahkeJadwalbtn;
    private NestedScrollView scrollView;
    private TextView senEdit,selEdit,rabEdit,kamEdit,jumEdit,sabEdit,mingEdit;
    private RecyclerView senRecView,selRecView,rabRecView,kamRecView,jumRecView,sabRecView,mingRecView;
    private JadwalAdapter senAdapter,selAdapter,rabAdapter,kamAdapter,jumAdapter,sabAdapter,mingAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal);
initViews();
initAdapter();
initRecView();
        if(Utils.getUsersPlan().size()>0){
            scrollView.setVisibility(View.VISIBLE);
            noPlanJadwalLayout.setVisibility(View.GONE);
        }
        else{
            scrollView.setVisibility(View.GONE);
            noPlanJadwalLayout.setVisibility(View.VISIBLE);
        }
    }

    private void initAdapter(){
        senAdapter = new JadwalAdapter(this);
        ArrayList<JadwalModel> senPlan = new ArrayList<>();
        for(JadwalModel plan : Utils.getUsersPlan()){
            if(plan.getDays().equals("Senin"))
                senPlan.add(plan);
        }
        senAdapter.setPlanList(senPlan);

        selAdapter = new JadwalAdapter(this);
        ArrayList<JadwalModel> selPlan = new ArrayList<>();
        for(JadwalModel plan :Utils.getUsersPlan()){
            if(plan.getDays().equals("Selasa"))
                selPlan.add(plan);
        }
        selAdapter.setPlanList(selPlan);

        rabAdapter = new JadwalAdapter(this);
        ArrayList<JadwalModel> rabPlan = new ArrayList<>();
        for(JadwalModel plan : Utils.getUsersPlan()){
            if(plan.getDays().equals("Rabu"))
                rabPlan.add(plan);
        }
        rabAdapter.setPlanList(rabPlan);

        kamAdapter = new JadwalAdapter(this);
        ArrayList<JadwalModel> kamPlan = new ArrayList<>();
        for(JadwalModel plan : Utils.getUsersPlan()){
            if(plan.getDays().equals("Kamis"))
                kamPlan.add(plan);
        }
        kamAdapter.setPlanList(kamPlan);

        jumAdapter = new JadwalAdapter(this);
        ArrayList<JadwalModel> jumPlan = new ArrayList<>();
        for(JadwalModel plan : Utils.getUsersPlan()){
            if(plan.getDays().equals("Jumat"))
                jumPlan.add(plan);
        }
        jumAdapter.setPlanList(jumPlan);

        sabAdapter = new JadwalAdapter(this);
        ArrayList<JadwalModel> sabPlan = new ArrayList<>();
        for(JadwalModel plan : Utils.getUsersPlan()){
            if(plan.getDays().equals("Sabtu"))
                sabPlan.add(plan);
        }
        sabAdapter.setPlanList(sabPlan);

        mingAdapter = new JadwalAdapter(this);
        ArrayList<JadwalModel> mingPlan = new ArrayList<>();
        for(JadwalModel plan : Utils.getUsersPlan()){
            if(plan.getDays().equals("Minggu"))
                mingPlan.add(plan);
        }
        mingAdapter.setPlanList(mingPlan);
    }

    public void initRecView(){
        senRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        senRecView.setAdapter(senAdapter);
        selRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        selRecView.setAdapter(selAdapter);
        rabRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rabRecView.setAdapter(rabAdapter);
        kamRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        kamRecView.setAdapter(kamAdapter);
        jumRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        jumRecView.setAdapter(jumAdapter);
        sabRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        sabRecView.setAdapter(sabAdapter);
        mingRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mingRecView.setAdapter(mingAdapter);
    }

    private void initViews(){
        senRecView = findViewById(R.id.recViewSenin);
        selRecView = findViewById(R.id.recViewSelasa);
        rabRecView = findViewById(R.id.recViewRabu);
        kamRecView = findViewById(R.id.recViewKamis);
        jumRecView = findViewById(R.id.recViewJumat);
        sabRecView = findViewById(R.id.recViewSabtu);
        mingRecView = findViewById(R.id.recViewMinggu);

        senEdit = findViewById(R.id.seninEdit);
        selEdit = findViewById(R.id.selasaEdit);
        rabEdit = findViewById(R.id.rabuEdit);
        kamEdit = findViewById(R.id.kamisEdit);
        jumEdit = findViewById(R.id.jumatEdit);
        sabEdit = findViewById(R.id.sabtuEdit);
        mingEdit = findViewById(R.id.mingguEdit);

        noPlanJadwalLayout = findViewById(R.id.noPlanJadwalLayout);
        scrollView = findViewById(R.id.nestedcScroll);
        tambahkeJadwalbtn = findViewById(R.id.tambahkanBtn);
    }

    public void onClick(View view) {
        Intent intent = new Intent(JadwalActivity.this, EditActivity.class);
        switch(view.getId()){
            case R.id.seninEdit: intent.putExtra("Jadwalkan Hari", "Senin");
                startActivity(intent);
                break;
            case R.id.selasaEdit: intent.putExtra("Jadwalkan Hari", "Selasa");
                startActivity(intent);
                break;
            case R.id.rabuEdit: intent.putExtra("Jadwalkan Hari", "Rabu");
                startActivity(intent);
                break;
            case R.id.kamisEdit: intent.putExtra("Jadwalkan Hari", "Kamis");
                startActivity(intent);
                break;
            case R.id.jumatEdit: intent.putExtra("Jadwalkan Hari", "Jumat");
                startActivity(intent);
                break;
            case R.id.sabtuEdit: intent.putExtra("Jadwalkan Hari", "Sabtu");
                startActivity(intent);
                break;
            case R.id.mingguEdit: intent.putExtra("Jadwalkan Hari", "Minggu");
                startActivity(intent);
                break;
            default:startActivity(intent);
                break;
        }
    }

//    @Override
//    public void onBackPressed() {
//        Intent intent = new Intent(this, HomeActivity.class);
//        startActivity(intent);
//        super.onBackPressed();
//        finish();
//    }

    public void aturSekarangbtn(View view) {
        Intent intent = new Intent(this, LatihanActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
