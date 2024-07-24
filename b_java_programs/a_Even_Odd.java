package com.dsa_bootcamp_assignments.b_java_programs;

import java.util.Scanner;

public class a_Even_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean res = evenOdd(in.nextInt());
        System.out.println(res);
    }

    static boolean evenOdd(int num){
        if (num % 2 == 0 ){
            return true;
        }
        return false;
    }
}
