package com.example.mywolkoutjourney;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ScrollView;

import androidx.annotation.NonNull;

public class LatihanModel implements Parcelable {
    private int id;
    private String nama;
    private String deskripsi;
    private String gambar;

    public LatihanModel(int id, String nama, String deskripsi,String gambar){
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public LatihanModel(){

    }

    protected LatihanModel(Parcel in) {
    id = in.readInt();
    nama = in.readString();
    deskripsi = in.readString();
    gambar = in.readString();
    }

    public static final Creator<LatihanModel> CREATOR = new Creator<LatihanModel>() {
        @Override
        public LatihanModel createFromParcel(Parcel in) {
            return new LatihanModel(in);
        }

        @Override
        public LatihanModel[] newArray(int size) {
            return new LatihanModel[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    @NonNull
    @Override
    public String toString() {
        return "LatihanModel{"+
                "nama='"+nama+ '\''+
                ", deskripsi='"+deskripsi+'\''+
                ", gambar='"+gambar+'\''+
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
    parcel.writeInt(id);
    parcel.writeString(nama);
    parcel.writeString(deskripsi);
    parcel.writeString(gambar);
    }
}
