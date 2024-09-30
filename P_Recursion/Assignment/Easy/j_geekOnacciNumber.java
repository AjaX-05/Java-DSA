package com.dsa_bootcamp_assignments.P_Recursion.Assignment.Easy;

public class j_geekOnacciNumber {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 2;
        int n = 5;
        System.out.println(geekOnacci(a, b, c, n));
    }

    static int geekOnacci(int a, int b, int c, int n) {
        if (n == a) {
            return a;
        }
        if (n == b) {
            return b;
        }
        if (n == c) {
            return c;
        }

        return (geekOnacci(a, b, c, n - 1) + geekOnacci(a, b, c, n - 2) + geekOnacci(a, b, c, n - 3));

    }
}
