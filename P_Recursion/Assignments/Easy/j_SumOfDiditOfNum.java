package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class j_SumOfDiditOfNum {
    public static void main(String[] args) {
        int num = 45632;
        String s = String.valueOf(num);
//        System.out.println(stringMethod(0, s));

//        System.out.println(12345 % 10);
//        System.out.println(12345 / 10);
        System.out.println(sumOfDigit(0,num));


    }

    static int stringMethod(int p, String up) {
        if (up.isEmpty()) {
            return p;
        }

        int n = up.charAt(0) - '0';
        return stringMethod(p + n, up.substring(1));
    }

    static int sumOfDigit(int p, int up) {
        if (up == 0) {
            return p;
        }
        int n = up % 10;
        return sumOfDigit(p + n, up / 10);
    }
}
