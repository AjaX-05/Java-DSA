package com.dsa_bootcamp_assignments.Q_MathForDSA;

public class h_NoOfDigits {
    public static void main(String[] args) {
//        int n = 70;
//
//        int counter = 0;
//        while (n > 0) {
//            n = n >> 1;
//            counter++;
//        }
//
//        System.out.println(counter);

        int n = 100; // Num
        int b = 2; // Base

        int ans = (int) (Math.log(n) / Math.log(b) + 1);
        System.out.println(ans);
    }
}
