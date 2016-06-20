package com.caizenghui.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by caizenghui on 16/6/20.
 */
public class User implements Parcelable {
    private String name;
    private int age;
    private String address;
    private double test;

    public User(double test, String name, int age, String address) {
        this.test = test;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTest() {
        return test;
    }

    public void setTest(double test) {
        this.test = test;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
        dest.writeString(this.address);
        dest.writeDouble(this.test);
    }

    protected User(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
        this.address = in.readString();
        this.test = in.readDouble();
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
