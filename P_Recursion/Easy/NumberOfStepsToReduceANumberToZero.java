package com.dsa_bootcamp_assignments.P_Recursion.Easy;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int num = 14;
        int res = steps(num);
        System.out.println(res);
    }

    static int steps(int num) {
        int count = 0;
        return helper(num, count);
    }

    static int helper(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return helper(num / 2, count + 1);
        }
        return helper((num - 1), count + 1);
    }
}
