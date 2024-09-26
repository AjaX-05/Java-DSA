package com.dsa_bootcamp_assignments.P_Recursion.Assignment.Easy;

public class b_findMinumum {
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, -5, -4, 8, -6};
        int n = nums.length ;
        System.out.println(min(nums, n));
    }

    static int min(int[] nums, int n) {
        if (n == 1) {
            return nums[0];
        }

        return Math.min(nums[n - 1], min(nums, n - 1));
    }
}
