package com.dsa_bootcamp_assignments.Q_MathForDSA;

public class a_OddEven {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n) {
        return ((n & 1) == 1);
    }
}
