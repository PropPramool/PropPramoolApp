package com.example.kaogi.proppra;

/**
 * Created by Taytay on 5/19/2018.
 */

public class Item {
    private String mProperty_id;
    private String mSize;
    private String mLocation;
    private String mTime_remain;
    private String mStart_at;
    private int mImageResourceId;

    public Item(String property_id, String size, String location, String time_remain, String start_at, int ImageResourceId)
    {
        mProperty_id=property_id;
        mSize=size;
        mLocation=location;
        mTime_remain=time_remain;
        mStart_at=start_at;
        mImageResourceId=ImageResourceId;
    }

    public String getmProperty_id() {
        return mProperty_id;
    }

    public String getmSize() {
        return mSize;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmTime_remain() {
        return mTime_remain;
    }

    public String getmStart_at() {
        return mStart_at;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
