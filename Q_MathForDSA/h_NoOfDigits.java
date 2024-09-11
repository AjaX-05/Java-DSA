package com.dsa_bootcamp_assignments.Q_MathForDSA;

public class h_NoOfDigits {
    public static void main(String[] args) {
        int n = 1;

        int counter = 0;
        while (n > 0) {
            n = n >> 1;
            counter++;
        }

        System.out.println(counter);
    }
}
