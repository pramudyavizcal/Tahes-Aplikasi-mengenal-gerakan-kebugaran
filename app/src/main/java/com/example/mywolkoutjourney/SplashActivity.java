package com.example.mywolkoutjourney;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mywolkoutjourney.HomeActivity;
import com.example.mywolkoutjourney.R;


public class SplashActivity extends AppCompatActivity{
    ImageView logo;


    @Override
    protected void onCreate(Bundle incicle) {
        super.onCreate(incicle);
//      getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        if (isWorkingInternetPersent()) {
            splash();
        } else {
            showAlertDialog(SplashActivity.this, "Internet Connection",
                    "You don't have internet connection", false);
        }
    }
    public void splash() {
            new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                    Intent mainIntent = null;
                    mainIntent = new Intent(SplashActivity.this,HomeActivity.class);
                    SplashActivity.this.startActivity(mainIntent);
                    SplashActivity.this.finish();
                }
            }, 1000);

    }

    public boolean isWorkingInternetPersent() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getBaseContext()
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo[] info = connectivityManager.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }

        }
        return false;
    }
    public void showAlertDialog(SplashActivity context, String title, String message, Boolean status) {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(SplashActivity.this);

        // Setting Dialog Title
        alertDialog.setTitle("No internet connection");

        // Setting Dialog Message
        alertDialog.setMessage("Periksa kembali koneksi internet kamu");

        // Setting alert dialog icon
        // alertDialog.setIcon((status) ? R.mipmap.ic_launcher : R.mipmap.ic_launcher);

        // Setting OK Button
        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                System.exit(0);
            }
        });

        // Showing Alert Message
        alertDialog.show();
    }
}