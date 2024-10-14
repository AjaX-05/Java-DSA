package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class g_fibonacciNumber {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibonacci(n));
    }


    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
