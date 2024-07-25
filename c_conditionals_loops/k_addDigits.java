package com.dsa_bootcamp_assignments.c_conditionals_loops;
//https://leetcode.com/problems/add-digits
public class k_addDigits {
    public static void main(String[] args) {
        int num = 38;
        int val = checkDigits(num);
        System.out.println(val);
    }
    static int checkDigits(int num){
        int res = addDigits(num);
//        int res2 = 0;
        while (res > 9){
            res = addDigits(res);
        }
        return res;
    }
    static int addDigits(int num){
        int temp = 0;
        while (num > 0){
            temp = temp + (num % 10);
            num = num / 10;
        }
        return temp;
    }
}
