package com.dsa_bootcamp_assignments.Q_MathForDSA;

import java.util.Arrays;

public class c_iThBitOfANumber {
    public static void main(String[] args) {
        int n = 10110110;
        int i = 5;
        System.out.println(ans(n, i));
    }

    static int ans(int num, int i) {
        int mask = 1 << (i - 1);
//        System.out.println(mask);
        int bit = (num & mask) >> (i-1);
        System.out.println(bit);
       return num;
    }
}
