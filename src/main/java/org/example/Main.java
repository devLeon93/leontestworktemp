package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Leonid","Barsucovschi","Oleg",31));
        studentList.add(new Student("Vadim","Bodarev","Vasilii",30));
        studentList.add(new Student("Nicolai","Luca","Oleg",28));
        studentList.add(new Student("Olga","Larionova","Anatol",45));


       List<Student> studentNew = studentList.stream()
               .filter(st->st.getFirstname().equals("Vadim")).collect(Collectors.toList());
        System.out.println(studentNew);

        List<Boolean> booleans = studentList.stream().map(student -> student.getAge() > 23).collect(Collectors.toList());
        System.out.println(booleans);




    }
}