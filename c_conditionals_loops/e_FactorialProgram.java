package com.dsa_bootcamp_assignments.c_conditionals_loops;

import java.util.Scanner;

public class e_FactorialProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputVal = in.nextInt();
        System.out.println(factorial(inputVal));
    }
    static int factorial(int num){
        if (num == 0){
            return 1;
        }
        int res = 1;
        while (num >= 1){
            res = res * num;
            num--;
        }
        return res;
    }

}

