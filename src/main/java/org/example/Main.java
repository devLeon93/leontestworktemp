package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Leonid","Barsucovschi","Oleg",31));
        studentList.add(new Student("Vadim","Bodarev","Vasilii",30));
        studentList.add(new Student("Nicolai","Luca","Oleg",28));
        studentList.add(new Student("Olga","Larionova","Anatol",45));

        System.out.println(studentList.get(3));

    }
}