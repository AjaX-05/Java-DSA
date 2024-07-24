package com.dsa_bootcamp_assignments.c_conditionals_loops;

import java.util.Scanner;

public class d_LargestOfAllInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int largest = 0;
        while (true){
            int inp = in.nextInt();
            if (inp !=0){
                if (inp > largest){
                    largest = inp;
                }
            }else {
                break;
            }
        }
        System.out.println(largest);
    }
}
