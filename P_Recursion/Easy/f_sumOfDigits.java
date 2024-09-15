package com.dsa_bootcamp_assignments.P_Recursion.Easy;

public class f_sumOfDigits {
    public static void main(String[] args) {
        int num = 1342;
        System.out.println(sum(num));
    }

    static int sum(int num) {
        if (num < 1) {
            return num;
        }
        return num % 10 + sum((int) (num / 10));
    }
}