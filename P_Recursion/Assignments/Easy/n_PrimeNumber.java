package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

import java.util.ArrayList;

public class n_PrimeNumber {
    public static void main(String[] args) {
        int num = 499979;
//        System.out.println(isBoolean(num, 2));
        System.out.println(primeCount(num-1, 2));

    }

    static int primeCount(int num, int n) {
        if (num < 2) {
            return 0;
        }

        if (n * n > num) {

            return 1 + primeCount(num - 1, 2);
        }

        if (num % n == 0) {
            return primeCount(num - 1, 2);
        }

        return primeCount(num, n + 1);
    }


    static boolean isBoolean(int num, int n) {
        if (num <= 1) {
            return false;
        }

        if (n * n > num) {
            return true;
        }

        if (num % n == 0) {
            return false;
        }


        return isBoolean(num, n + 1);
    }
}
