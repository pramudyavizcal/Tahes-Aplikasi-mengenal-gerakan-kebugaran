package com.example.mywolkoutjourney;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;

public class HomeActivity extends AppCompatActivity {
private Button btnJadwal, btnLatihan, btnTentang;
    InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        StartAppSDK.setTestAdsEnabled(BuildConfig.DEBUG);
        createInterstitial();
        StartAppSDK.init(this,"203925175",true);
        setContentView(R.layout.activity_home);
        btnJadwal = findViewById(R.id.jadwalTahes);
        btnLatihan = findViewById(R.id.latihanTahes);
        btnTentang = findViewById(R.id.tentangTahes);
        Utils utils = new Utils(); //Penting walaupun var tidak terpakai
        btnJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                someMethod();
            }
        });
        btnLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                someMethod();
            }
        });
        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInterstitial();
                Intent intent = new Intent(HomeActivity.this, TentangActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Keluar aplikasi?")
                .setPositiveButton("Keluar", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("Batal", null)
                .show();
    }
    public void showRewardedVideo() {
        final StartAppAd rewardedVideo = new StartAppAd(this);

        rewardedVideo.setVideoListener(new VideoListener() {
            @Override
            public void onVideoCompleted() {
                // Grant the reward to user
            }
        });

        rewardedVideo.loadAd(StartAppAd.AdMode.REWARDED_VIDEO, new AdEventListener() {
            @Override
            public void onReceiveAd(Ad ad) {
                rewardedVideo.showAd();
            }

            @Override
            public void onFailedToReceiveAd(Ad ad) {
                // Can't show rewarded video
            }
        });
    }
    public void someMethod() {
        // start your next activity
        startActivity(new Intent(this, LatihanActivity.class));

        // and show interstitial ad
        StartAppAd.showAd(this);
    }
    public void createInterstitial() {
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-7496679438317923/8285727435"); // Ganti sesuai dengan kode interstitial ads anda
        loadInterstitial();
    }

    public void loadInterstitial() {
        AdRequest interstitialRequest = new AdRequest.Builder().build();
        interstitialAd.loadAd(interstitialRequest);
    }

    public void showInterstitial() {
        if (interstitialAd.isLoaded()) {
            interstitialAd.show();
            interstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdLoaded() {
                    // not call show interstitial ad from here
                }

                @Override
                public void onAdClosed() {
                    loadInterstitial();
                }
            });
        } else {
            loadInterstitial();
        }
    }
}
