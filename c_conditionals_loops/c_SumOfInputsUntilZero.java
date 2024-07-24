package com.dsa_bootcamp_assignments.c_conditionals_loops;

import java.util.Scanner;

public class c_SumOfInputsUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        while (true){
            int inp = in.nextInt();
            if (inp !=0){
                sum = sum + inp;
            }else {
                break;
            }
        }
        System.out.println(sum);
    }

}
