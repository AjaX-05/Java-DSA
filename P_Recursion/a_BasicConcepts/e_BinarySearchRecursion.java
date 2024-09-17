package com.dsa_bootcamp_assignments.P_Recursion.a_BasicConcepts;

public class e_BinarySearchRecursion {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 16, 18, 20, 24, 33, 45, 56, 79, 80, 92, 95, 99, 102};
        int target = 33;
//        System.out.println(nums.length);

        int res = BS(nums, target, 0, nums.length - 1);
        System.out.println(res);
    }

    static int BS(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (nums[m] == target) {
            return m;
        }
        if (target > nums[m]) {
            return BS(nums, target, m + 1, e);
        }
        return BS(nums, target, s, m - 1);

    }
}
