package com.dsa_bootcamp_assignments.a_flow_of_program;

import java.util.Scanner;

public class D_HCF_LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("HCF: "+HCF(a,b));
        System.out.println("LCM: "+LCM(a,b));

    }
    static int HCF(int a, int b){
        while (b != 0){
            int temp = a;
            a = b;
            b = temp % a;
        }
        int hcf = a;
        return hcf;
    }

    static int LCM(int a, int b){
        int lcm = (a * b) / HCF(a,b);
        return lcm;
    }
}
