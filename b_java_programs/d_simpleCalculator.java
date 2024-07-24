package com.dsa_bootcamp_assignments.b_java_programs;

import java.util.Scanner;

public class d_simpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num1, num2 and operator");
        System.out.println("Abailable Operators: + - * / %");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        char operator = in.next().charAt(0);

        double res = calc(num1,num2,operator);
        System.out.println(res);
    }

    static double calc(double i1, double i2, char op){
        if (op == '+'){
            return i1+i2;
        } else if (op == '-') {
            return i1-i2;
        } else if (op == '*') {
            return i1*i2;
        } else if (op == '/') {
            if (i2 == 0){
                System.out.println("denominator cannot be 0!!!");
            }else {
                return i1/i2;
            }
        }else{
            return i1%i2;
        }
        return -1;
    }
}
