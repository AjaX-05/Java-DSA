package com.dsa_bootcamp_assignments.P_Recursion.Easy;

public class powerOf4 {
    public static void main(String[] args) {
        int num = 256;
        int res = (int) check(num);
        if (res == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static double check(double num) {
        if (num == 1) {
            return num;
        }
        if (num < 1) {
            return -1;
        }
//        Tail recursion
        return check(num / 4);
    }
}
