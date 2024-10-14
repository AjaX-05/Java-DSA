package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class h_SpecialFibonacci {
    public static void main(String[] args) {
        int n = 86;
        int a = 93;
        int b = 35;
        System.out.println(fibo(n % 3, a, b));
    }

    static int fibo(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }

        return fibo(n - 1, a, b) ^ fibo(n - 2, a, b);
    }

}
