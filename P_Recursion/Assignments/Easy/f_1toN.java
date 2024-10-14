package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class f_1toN {
    public static void main(String[] args) {
        int n = 5;
        int start = 1;
        printTillN(start, n);
    }

    static void printTillN(int start, int n) {
        if (start > n) {
            return;
        }

        System.out.println(start);
        printTillN(start + 1, n);
    }
}
