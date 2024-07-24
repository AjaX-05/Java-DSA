package com.dsa_bootcamp_assignments.b_java_programs;

import java.util.Scanner;

public class g_fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ntF = in.nextInt();
        System.out.println(fibonacci(ntF));
        }

        static int fibonacci(int ntF) {

            int num1 = 0;
            int num2 = 1;
            int counter = 1;
            if (ntF < 1){
                return 0;
            }
            while (ntF > counter){
                ntF--;
                int temp = num1;
                num1 = num2;
                num2 = temp + num1;
            }
            return num2;
        }
}
