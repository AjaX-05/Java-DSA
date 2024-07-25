package com.dsa_bootcamp_assignments.c_conditionals_loops;

import java.util.Scanner;

public class j_perfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(perfectNo(in.nextInt()));
    }

    static boolean perfectNo(int num){
        int originalNum = num;
        int sum = -num;
        while (num > 0){
            if (originalNum % num == 0){
                sum += num;
            }
            num--;
        }
        if (originalNum == sum){
            return true;
        }
        return false;
    }
}
