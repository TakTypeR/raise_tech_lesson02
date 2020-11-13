package com.company;

public class MyException extends Exception {
    public MyException(String iLocation, String iMsg){
        super(iMsg);
        this.location = iLocation;
    }
    public String getLocation(){ return this.location; }

    private String location = "";
}
