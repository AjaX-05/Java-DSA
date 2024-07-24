package com.dsa_bootcamp_assignments.c_conditionals_loops;

import java.util.Scanner;

public class f_powerOfaNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int exponent = in.nextInt();
//                2 power 5
        System.out.println(power(base,exponent));
    }

    static double power(int base, int exponent){
        int res = 1;
        while (exponent > 0){
            res = res * base;
            exponent--;
        }
        return res;
    }
}
