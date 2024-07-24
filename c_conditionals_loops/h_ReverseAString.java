package com.dsa_bootcamp_assignments.c_conditionals_loops;

import java.util.Scanner;

public class h_ReverseAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String res = "";
        for (int i = name.length()-1; i >= 0; i--) {
            res = res + name.charAt(i);
        }
        System.out.println(res);
    }
}
