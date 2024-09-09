package com.dsa_bootcamp_assignments.Q_MathForDSA;

public class e_resetIthBit {
    public static void main(String[] args) {
        int num = 86;
        int i = 5;

        int mask = 1 << (i - 1);
        System.out.println(Integer.toBinaryString(mask ^ num));
    }


}
