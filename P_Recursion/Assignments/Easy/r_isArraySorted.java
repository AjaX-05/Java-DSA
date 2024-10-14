package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class r_isArraySorted {
    public static void main(String[] args) {
        int[] nums = {6, -5, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(isSorted(nums, 1));
    }

    static boolean isSorted(int[] nums, int p) {
        if (p == nums.length) {
            return true;
        }

        if (nums[p] > nums[p - 1]) {
            return isSorted(nums, ++p);
        } else {
            return false;
        }
    }
}
