package com.db.secondcourse;

public class Main {
    public static void main(String[] args) {
        Doctor[] doctors = new Doctor[5];
        for(int i=0 ; i<5 ; i++){
            if(i%2 == 0){
                Surgeon newSurgeon = new Surgeon("Alex", "Trauma");
                doctors[i] = newSurgeon;
            }
            else{
                Generalist newGeneralist = new Generalist("Andrei", 3);
                doctors[i] = newGeneralist;
            }
        }
        for(int i=0 ; i<5 ; i++){
            System.out.println(doctors[i]);
        }
    }

}
