package com.dsa_bootcamp_assignments.a_flow_of_program;

import java.util.Scanner;

public class A_LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }else {
                System.out.println(false);
            }
        }else {
            System.out.println(false);
        }
    }
}
