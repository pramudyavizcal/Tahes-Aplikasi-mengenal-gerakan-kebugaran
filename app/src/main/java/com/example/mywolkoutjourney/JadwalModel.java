package com.example.mywolkoutjourney;

import android.os.Parcel;
import android.os.Parcelable;

public class JadwalModel implements Parcelable {
    private String days;
    private int menit;
    private LatihanModel latihanModel;
    private boolean isAccomplished;

    public JadwalModel(String days, int menit, LatihanModel latihanModel, boolean isAccomplished) {
        this.days = days;
        this.menit = menit;
        this.latihanModel = latihanModel;
        this.isAccomplished = isAccomplished;
    }

    public JadwalModel(){ }            // default constructor

    protected JadwalModel(Parcel in) {
        days = in.readString();
        menit = in.readInt();
        latihanModel = in.readParcelable(LatihanModel.class.getClassLoader());
        isAccomplished = in.readByte() != 0;
    }

    public static final Creator<JadwalModel> CREATOR = new Creator<JadwalModel>() {
        @Override
        public JadwalModel createFromParcel(Parcel in) {
            return new JadwalModel(in);
        }

        @Override
        public JadwalModel[] newArray(int size) {
            return new JadwalModel[size];
        }
    };

    public boolean getIsAccomplished() {
        return isAccomplished;
    }

    public void setIsAccomplished(boolean accomplished) {
        isAccomplished = accomplished;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public int getMinutes() {
        return menit;
    }

    public void setMinutes(int menit) {
        this.menit = menit;
    }

    public LatihanModel getGym() {
        return latihanModel;
    }

    public void setGym(LatihanModel gymObj) {
        latihanModel = gymObj;
    }

    @Override
    public String toString() {
        return "Plans{" +
                "days='" + days + '\'' +
                ", menit=" + menit +
                ", latihanmodel=" + latihanModel +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(days);
        dest.writeInt(menit);
        dest.writeParcelable(latihanModel, flags);
        dest.writeByte((byte) (isAccomplished ? 1 : 0));
    }
}
