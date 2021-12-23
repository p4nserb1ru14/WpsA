package com.example.wps;

import android.os.Parcel;
import android.os.Parcelable;

public class Wisata implements Parcelable {

    public String title;
    public int wisataImage;
    public double rating;
    public String location;

    public Wisata(String title, int wisataImage, double rating, String location) {
        this.title = title;
        this.wisataImage = wisataImage;
        this.rating = rating;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWisataImage() {
        return wisataImage;
    }

    public void setWisataImage(int wisataImage) {
        this.wisataImage = wisataImage;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeInt(this.wisataImage);
        dest.writeDouble(this.rating);
        dest.writeString(this.location);
    }

    public void readFromParcel(Parcel source) {
        this.title = source.readString();
        this.wisataImage = source.readInt();
        this.rating = source.readDouble();
        this.location = source.readString();
    }

    protected Wisata(Parcel in) {
        this.title = in.readString();
        this.wisataImage = in.readInt();
        this.rating = in.readDouble();
        this.location = in.readString();
    }

    public static final Creator<Wisata> CREATOR = new Creator<Wisata>() {
        @Override
        public Wisata createFromParcel(Parcel source) {
            return new Wisata(source);
        }

        @Override
        public Wisata[] newArray(int size) {
            return new Wisata[size];
        }
    };
}
