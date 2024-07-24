package com.dsa_bootcamp_assignments.b_java_programs;

import java.util.Scanner;

public class i_armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(armStrong(num));
    }

    static boolean armStrong(int n){
        int originalN = n;
        int eachDigit;
        int res = 0;
        while (n > 0){
            int temp = n%10;
            eachDigit = temp*temp*temp;
            res += eachDigit;
            n = n/10;
        }
        return res == originalN;
    }
}
