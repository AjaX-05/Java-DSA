package com.dsa_bootcamp_assignments.P_Recursion;

public class b_NumbersExample {
    public static void main(String[] args) {
//        write a function that takes in a number and prints it
//        print first 5 numbers: 1 2 3 4 5

        numbers1(1);
    }

    static void numbers1(int n) {
        System.out.println(n);
        numbers2(n + 1);
    }

    static void numbers2(int n) {
        System.out.println(n);
        numbers3(n + 1);
    }

    static void numbers3(int n) {
        System.out.println(n);
        numbers4(n + 1);
    }

    static void numbers4(int n) {
        System.out.println(n);
        numbers5(n + 1);
    }

    static void numbers5(int n) {
        System.out.println(n);
    }
}
