package com.tcv.fourthcourse;

public class Main {
    public static void main(String[] args) {
    Wrapper<Integer> wrapper = new Wrapper<Integer>(5,6);


    }
}

class Wrapper <T extends Number> {
    public Wrapper(T var1, T var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    T var1, var2;
    T addNum() {
        return var1;
        //return var1 + var2;
    }
}