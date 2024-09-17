package com.dsa_bootcamp_assignments.P_Recursion.a_BasicConcepts;

public class i_countZeros {
    public static void main(String[] args) {
        int num = 30204;
        int count = 0;
        int res = zeros(num, count);
        System.out.println(res);
    }

//    Special pattern, how to pass value to above calls.
    static int zeros(int num, int count) {
        if (num == 0) {
            return count;
        }
        int rem = num % 10;
        if (rem == 0) {
            return zeros(num / 10, count+1);
        } else {
            return zeros(num / 10, count);
        }
    }


//    static void zeros(int num) {
//        int count = 0;
//        helper(count, num);
//    }
//
//    static void helper(int count, int num) {
//        if (num % 10 == num) {
//            System.out.println(count);
//            return;
//        }
//        int rem = num % 10;
//        if (rem == 0) {
//            count++;
//        }
//        helper(count, num / 10);
//    }
}
