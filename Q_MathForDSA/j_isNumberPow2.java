package com.dsa_bootcamp_assignments.Q_MathForDSA;

public class j_isNumberPow2 {
    public static void main(String[] args) {
//        int num = 2;
//        int temp = 0;
//
//        while (num > 0) {
//            if ((num & 1) == 1) {
//                temp++;
//            }
//            num = num >> 1;
//        }
//        if (temp == 1) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

        int num = 31;
        if (num == 0) {
//            return false
        }
        if ((num & num - 1) == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}