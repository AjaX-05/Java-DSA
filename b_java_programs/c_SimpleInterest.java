package com.dsa_bootcamp_assignments.b_java_programs;

import java.util.Scanner;

public class c_SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double principleAmt = in.nextDouble();
        double interestRate = in.nextDouble();
        double time = in.nextDouble();

        double res = simpleInterest(principleAmt,interestRate,time);
        System.out.println("Interest Rate: " +res);
        System.out.println("Total Amt to be paid: " +(res+principleAmt));
    }

    static double simpleInterest(double pA, double iR, double t ){
        double si = (pA * iR * t)/100;
        return si;
    }
}
