package com.db.secondcourse;

public class Generalist extends Doctor {
    private int noPatients;

    public Generalist(String name, int noPatients){
        super.setName(name);
        this.noPatients = noPatients;
    }
    public Generalist(){}
}
