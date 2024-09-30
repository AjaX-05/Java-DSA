package com.dsa_bootcamp_assignments.P_Recursion.Assignment.Easy;

public class f_1ToNWithoutLoop {
    public static void main(String[] args) {
        int n = 10;
        int s = 1;
        toN(n, s);
    }

    static void toN(int n, int s) {
        if (s > n) {
            return;
        }
        System.out.println(s);
        toN(n, s + 1);

//        to print in Reverse (N to 1)
//        System.out.println(s);
    }
}
