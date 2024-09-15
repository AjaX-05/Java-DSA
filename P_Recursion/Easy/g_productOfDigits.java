package com.dsa_bootcamp_assignments.P_Recursion.Easy;

public class g_productOfDigits {
    public static void main(String[] args) {
        int num = 135;
        System.out.println(product(num));
    }

    static int product(int num) {
        if (num == 1) {
            return num;
        }
        return num % 10 * product(num / 10);
    }
}
