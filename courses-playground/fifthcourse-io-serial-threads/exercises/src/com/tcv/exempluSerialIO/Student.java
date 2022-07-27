package com.tcv.exempluSerialIO;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private float grade;

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }
}
