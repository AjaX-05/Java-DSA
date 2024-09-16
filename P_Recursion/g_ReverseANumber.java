package com.dsa_bootcamp_assignments.P_Recursion;

public class g_ReverseANumber {
    public static void main(String[] args) {
        int num = 1121;
        int res = reverse(num);
        System.out.println(res);
    }

    static int reverse(int num) {
        int noOfDigits = (int) (Math.log10(num)) + 1;
        return helper(num, noOfDigits);
    }

    private static int helper(int num, int noOfDigits) {
        if (num % 10 == num) {
            return num;
        }
        int rem = num % 10;
        return (rem) * (int) Math.pow(10, noOfDigits - 1) + helper(num / 10, noOfDigits - 1);
    }

}