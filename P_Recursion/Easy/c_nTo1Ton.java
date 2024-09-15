package com.dsa_bootcamp_assignments.P_Recursion.Easy;

public class c_nTo1Ton {
    public static void main(String[] args) {
        func(5);
    }

    static void func(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        func(n - 1);
        System.out.println(n);
    }
}
