package com.dsa_bootcamp_assignments.R_OOPs;

import java.util.Arrays;

public class a_OOP {
    public static void main(String[] args) {
//        Student[] students = new Student[5];
//
//        System.out.println(Arrays.toString(students));
//
//        students[0] = new Student();
//        students[0].name = "Jax";
//        students[0].rno = 1;
//        students[0].marks = 95.87f;
//        System.out.println(students[0].marks);


        Student ajay = new Student(5, "Aj", 90.99f);
//        ajay.marks = 94.32f;

//        System.out.println(ajay.marks);
//        System.out.println(ajay.rno);
//        System.out.println(ajay.name);

        Student dx = new Student(6, "Dinesh", 96.76f);
        System.out.println(dx.marks);
        System.out.println(dx.rno);
        System.out.println(dx.name);
        dx.nameChange("Dyno");
        dx.greet();

        Student gg = ajay;
        System.out.println(gg.name);
    }

    static class Student {
        int rno;
        String name;
        float marks;

        void greet() {
            System.out.println("Hello my name is " + name);
        }

        void nameChange(String newName) {
            this.name = newName;
        }

        Student() {
            rno = 8;
            name = "Ajay";
            marks = 95.6f;
        }

        Student(int roll, String naam, float mark) {
            this.rno = roll;
            this.name = naam;
            this.marks = mark;
        }
    }
}