package com.dsa_bootcamp_assignments.P_Recursion.Easy;

public class b_1Ton {
    public static void main(String[] args) {
        func(5);
    }

    static void func(int n) {
        if (n < 1) {
            return;
        }
        func(n - 1);
        System.out.println(n);
    }
}
