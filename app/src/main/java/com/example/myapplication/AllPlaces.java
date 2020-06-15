package com.example.myapplication;

public class AllPlaces {
    private int mImageResourceId ;
    private String mName ;
    private String mDescreption ;
    boolean hasImage ;
    String mFullDescreption = "";
    public int RRAW ;

    public AllPlaces(String name , int imageR , String descreption){
        mName = name ;
        mImageResourceId = imageR ;
        mDescreption = descreption ;
        hasImage = true ;
    }

    public AllPlaces(String name , int imageR , String descreption, int x){
        mName = name ;
        mImageResourceId = imageR ;
        mDescreption = descreption ;
        hasImage = true ;
        RRAW = x ;
    }

    public AllPlaces(String name , int imageR , String descreption , String FD){
        mName = name ;
        mImageResourceId = imageR ;
        mDescreption = descreption ;
        mFullDescreption = FD ;
        hasImage = true ;
    }

    public AllPlaces(String name , String descreption){
        mName = name ;
        mDescreption = descreption ;
        hasImage = false ;
    }
    public int getmImageResourceId(){
        return mImageResourceId ;
    }

    public String getmName(){
        return mName ;
    }

    public String getmDescreption(){
        return mDescreption ;
    }

    public boolean isHasImage(){
        return hasImage ;
    }

    public String getFullDescreption(){
        return mFullDescreption ;
    }

    public int getRRAW() {
        return RRAW;
    }
}
