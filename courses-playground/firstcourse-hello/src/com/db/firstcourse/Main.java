package com.db.firstcourse;

public class Main {
    public static void main(String[] args) {
        /*
         String[] args sunt argumentele pe care le poti da la rularea programului
         Acestea se pot folosi in cod pentru a conditiona functionalitatea codului
         Spre ex: daca dam run in cmd "java Main a bcd e" atunci in vectorul args vom avea
         "a" , "bcd", "e"
         */

        System.out.println("Hello, world!");
        example1();
    }
    private static void example1(){
        int a = 5;
        double b = 5.5;
        float c = 2.4f;
        char d = 'a';
        boolean e = true;
        boolean f = a == b;
        Integer a1 = a;
        MyClass m = new MyClass(1,2);
        m.sayHello();
        String s = m.returnHello("Theo");
        System.out.println(s);
        System.out.println(s.equals("Hello Theo !"));
    }
}
