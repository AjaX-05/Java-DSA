package com.dsa_bootcamp_assignments.P_Recursion;

public class i_countZeros {
    public static void main(String[] args) {
        int num = 30204;
        zeros(num);
    }

    static void zeros(int num) {
        int count = 0;
        helper(count, num);
    }

    static void helper(int count, int num) {
        if (num % 10 == num) {
            System.out.println(count);
            return;
        }
        int rem = num % 10;
        if (rem == 0) {
            count++;
        }
        helper(count, num / 10);
    }
}
