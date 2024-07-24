package com.dsa_bootcamp_assignments.c_conditionals_loops;
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer
public class a_subtract_the_product_and_sum_of_digits_of_an_integer {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(productOfDigits(n)-sumOfDigit(n));
    }

    static int productOfDigits(int num){
        int res = 1;
        while (num > 0){
            int temp = num % 10;
            res = res * temp;
            num /= 10;
        }
        return res;
    }
    static int sumOfDigit(int num){
        int res = 0;
        while (num > 0){
            int temp = num % 10;
            res = res + temp;
            num /= 10;
        }
        return res;
    }
}
