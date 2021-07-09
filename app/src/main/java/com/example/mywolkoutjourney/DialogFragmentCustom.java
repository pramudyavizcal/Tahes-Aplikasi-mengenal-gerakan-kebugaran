package com.example.mywolkoutjourney;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.startapp.sdk.adsbase.StartAppAd;

import java.util.ArrayList;

public class DialogFragmentCustom extends DialogFragment {
    private EditText ed;
    private Spinner spinner;
    private Button tambahkan, batal;
    private Context context;
    private ArrayList<String> days;
    private GetData getData;

    public interface GetData{
        public void collectData(JadwalModel plan);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_custom, null);
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity())
                .setTitle("Tambah Jadwal")
                .setView(view);
        initViews(view);
        days = new ArrayList<>();
        days.add("Senin");
        days.add("Selasa");
        days.add("Rabu");
        days.add("Kamis");
        days.add("Jumat");
        days.add("Sabtu");
        days.add("Minggu");
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_dropdown_item, days);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        try {
            getData = (GetData) getActivity();                         // create interfse instance
        }catch(ClassCastException exp){exp.printStackTrace(); }

        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        tambahkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = getArguments();
                final String menit=ed.getText().toString();
                LatihanModel gymObject = bundle.getParcelable("incomingGym");
                if(null!=gymObject){
                    JadwalModel plan = new JadwalModel();
                    plan.setIsAccomplished(false);
                    plan.setDays(days.get(spinner.getSelectedItemPosition()));

                    if (TextUtils.isEmpty(menit)) {
                        ed.setError("Lama latihan kamu masih kosong");
                        ed.requestFocus();
                        return;
                    }else {
                        plan.setMinutes(Integer.parseInt(ed.getText().toString()));
                    }
                    plan.setGym(gymObject);
                    Utils.addUsersPlan(plan);
                    getData.collectData(plan);
                }

            }
        });
        return builder.create();
    }

    public void initViews(View view){
        ed = view.findViewById(R.id.menit);
        spinner = view.findViewById(R.id.spinner);
        tambahkan = view.findViewById(R.id.tambahkanBtn);
        batal = view.findViewById(R.id.batalBtn);
    }

}