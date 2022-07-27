package com.tcv.exempluIO;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("data.txt");
        BufferedWriter buff = new BufferedWriter(file);
        buff.write("Hello World!");
        buff.append('c');
        buff.close();

        FileReader reader = new FileReader("data.txt");
        BufferedReader buff2 = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        int x;
        while((x = buff2.read()) != -1){
            sb.append((char) x);
        }
        System.out.println(sb.toString());
    }
}
