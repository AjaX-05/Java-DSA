package com.dsa_bootcamp_assignments.d_functions;

import java.util.Scanner;

public class c_PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        System.out.println(pythagoreanTriplet(n1,n2,n3));
    }

    static boolean pythagoreanTriplet(int n1,int n2,int n3){
        int s1 = n1 * n1;
        int s2 = n2 * n2;
        int s3 = n3 * n3;

        return s1 + s2 == s3;
    }

}
