package com.tcv.exempluSerialIO;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alex", 8.81f));
        studentList.add(new Student("Andrei", 9.82f));
        Service.saveIntoBinaryFile("file.bin", studentList);
        studentList.clear();
        studentList = Service.readFromBinaryFile("file.bin");
    }
}
