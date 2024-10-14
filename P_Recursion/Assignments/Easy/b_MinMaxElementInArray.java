package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class b_MinMaxElementInArray {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(max(nums, nums.length - 1));
    }

    static int min(int[] nums, int n) {
        if (n == 1) {
            return nums[0];
        }

        return Math.min(nums[n - 1], min(nums, n - 1));
    }

    static int max(int[] nums, int n) {
        if (n == 1) {
            return nums[0];
        }
        return Math.max(nums[n - 1], max(nums, n - 1));
    }
}
