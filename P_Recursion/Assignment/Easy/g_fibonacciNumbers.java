package com.dsa_bootcamp_assignments.P_Recursion.Assignment.Easy;

public class g_fibonacciNumbers {
    public static void main(String[] args) {
        int n = 21;
        int res = fibo(n);
        System.out.println(res);
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}
