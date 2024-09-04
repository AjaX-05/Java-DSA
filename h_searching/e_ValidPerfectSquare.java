package com.dsa_bootcamp_assignments.h_searching;

public class e_ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerf(808201));
    }

    static boolean isPerf(int n) {
        if (n == 1) {
            return true;
        }
        int start = 1;
        int end = n / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square > n) {
                end = mid - 1;
            } else if (square < n) {
                start = mid + 1;
            }

            if (mid * mid == n) {
                return true;
            }
        }
        return false;
    }
}