package com.dsa_bootcamp_assignments.b_java_programs;

import java.util.Scanner;

public class h_plaindrome {
    public static void main(String[] args) {
//        12321
//        int numToFind = 12321;
        Scanner in = new Scanner(System.in);
        int numToFind = in.nextInt();
        boolean res = plaindrome(numToFind);
        System.out.println(res);
    }

    static boolean plaindrome(int ntF){
        int originalntF = ntF;
        String res = "";

        if (ntF == 0){
            return false;
        }

        while (ntF > 0){
            res += ntF % 10;
            ntF = ntF / 10;
        }
//        System.out.println(res);
//        return res.equals(Integer.toString(originalntF));
//          or
        return (Integer.parseInt(res) == originalntF);
    }
    }

