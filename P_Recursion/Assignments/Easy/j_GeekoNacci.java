package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class j_GeekoNacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 2;
        int n = 5;

        System.out.println(geeko(a, b, c, n));
    }

    static int geeko(int a, int b, int c, int n) {
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }
        if (n == 3) {
            return c;
        }

        return geeko(a, b, c, n - 1) + geeko(a, b, c, n - 2) + geeko(a, b, c, n - 3);

    }


}
