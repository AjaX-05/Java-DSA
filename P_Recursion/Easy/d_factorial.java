package com.dsa_bootcamp_assignments.P_Recursion.Easy;

public class d_factorial {
    public static void main(String[] args) {
//        int number = 5;
//        factorial(5,5);

        System.out.println(factorial(0));
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

//    static void factorial(int num, int temp) {
//        if (temp == 1) {
//            System.out.println(num);
//            return;
//        }
//        temp--;
//        factorial(num * temp, temp);
//    }
}