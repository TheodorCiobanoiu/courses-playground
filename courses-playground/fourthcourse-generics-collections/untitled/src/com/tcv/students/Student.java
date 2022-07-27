package com.tcv.students;

import java.util.Map;

public class Student implements Comparable<Student>{
    private String name;
    private double grade;
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student o) {
        if(this.grade > o.getGrade()) return 1;
        else if(this.grade < o.getGrade()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
