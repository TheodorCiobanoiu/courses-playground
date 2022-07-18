package com.db.secondcourse;

public abstract class Vehicle implements Comparable<Vehicle>{
    private String colour;
    private boolean functional;
    private double profit;

    public Vehicle(){}

    public Vehicle(String colour, boolean functional) {
        this.colour = colour;
        this.functional = functional;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFunctional() {
        return functional;
    }

    public void setFunctional(boolean functional) {
        this.functional = functional;
    }



    @Override
    public int compareTo(Vehicle compareVehicle) {
       if(this.profit > compareVehicle.profit){
           return 1;
       }
       else if(this.profit < compareVehicle.profit){
           return -1;
       }
       else return 0;
    }
}

class Bus extends Vehicle{
    private int noPassengers;
    private float ticketPrice;
    private double profit;
    private float charge;

    public Bus(int noPassengers, float ticketPrice) {
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

    public Bus(String colour, boolean functional, int noPassengers, float ticketPrice) {
        super(colour, functional);
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

}

class Taxi extends Vehicle{
    private int noPassengers;
    private float ticketPrice;

    public Taxi(int noPassengers, float ticketPrice) {
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

    public Taxi(String colour, boolean functional, int noPassengers, float ticketPrice) {
        super(colour, functional);
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

}
