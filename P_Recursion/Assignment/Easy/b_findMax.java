package com.dsa_bootcamp_assignments.P_Recursion.Assignment.Easy;

public class b_findMax {
    public static void main(String[] args) {
        int[] nums = {4, 3, -2, 9, -9};
        int n = nums.length;
        System.out.println(max_num(nums, n));
    }

    static int max_num(int[] nums, int n) {
        if (n == 1) {
            return nums[0];
        }

        return Math.max(nums[n - 1], max_num(nums, n - 1));
    }
}
