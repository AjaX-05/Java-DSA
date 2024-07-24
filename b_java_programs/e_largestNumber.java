package com.dsa_bootcamp_assignments.b_java_programs;

import java.util.Scanner;

public class e_largestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        if (n1 > n2){
            System.out.println(n1);
        }else {
            System.out.println(n2);
        }
    }
}
