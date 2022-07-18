package com.db.secondcourse;

public class Surgeon extends Doctor {
    private String expertise;

    public Surgeon(String name, String expertise){
        this.expertise = expertise;
        super.setName(name);
    }
    public Surgeon(){}
}
