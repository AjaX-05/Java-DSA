package com.dsa_bootcamp_assignments.P_Recursion.Easy;

public class a_nTo1 {
    public static void main(String[] args) {
        func(5);
    }

    static void func(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        func(n - 1);
    }
}
