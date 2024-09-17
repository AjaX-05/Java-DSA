package com.dsa_bootcamp_assignments.P_Recursion.a_BasicConcepts;

public class h_palindrome {
    public static void main(String[] args) {
        int num = -1112332111;
        int rev = isPalindrome(num);
        if (num < 0){
            System.out.println(false);
        }
        if (num == rev){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    static int isPalindrome(int num) {
        int digits = (int) (Math.log10(num)) + 1;
        return helper(num, digits);
    }

    static int helper(int num, int digits) {
        if (num / 10 < 1) {
            return num;
        }
        int rem = num % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(num / 10, digits - 1);
    }
}
