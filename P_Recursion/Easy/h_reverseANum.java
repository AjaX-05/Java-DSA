package com.dsa_bootcamp_assignments.P_Recursion.Easy;

public class h_reverseANum {
    static int sum = 0;
    static boolean minus = false;
    static void reverse(int num) {
        if (num <= 0) {
            if (num < 0) {
                num = num * -1;
                minus = true;
            } else {
                if (minus){
                    sum = sum * -1;
                }
                return;
            }
        }
        int rem = num % 10;
        sum = (sum * 10) + rem;
        reverse(num / 10);
    }

    public static void main(String[] args) {
        int num = 1534236469;
        reverse(num);
        System.out.println(sum);
    }
}
