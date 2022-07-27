package com.tcv.students;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Map<Integer, TreeSet<Student> > map = new HashMap<Integer, TreeSet<Student> >();

        Student newStudent = new Student("Ciobanoiu Theodor", 9.42D);
        Student newStudent2 = new Student("Ciobanoiu Alexandru", 9.52D);
        Student newStudent3 = new Student("Ciobanoiu Andrei", 8.62D);
        Student newStudent4 = new Student("Ciobanoiu Mihai", 8.72D);
        students.add(newStudent);
        students.add(newStudent2);
        students.add(newStudent3);
        students.add(newStudent4);

        for(Student s : students){
            int key = (int)Math.round(s.getGrade());
            if(map.containsKey(key)){
                map.get(key).add(s);
            }
            else {
                map.put(key, new TreeSet<>());
                map.get(key).add(s);
            }

        }
        System.out.println(map);
    }
}
