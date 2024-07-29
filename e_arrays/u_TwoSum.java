package com.dsa_bootcamp_assignments.e_arrays;

import java.util.Arrays;

public class u_TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] nums, int target) {
        int p1 = 0;
        int p2 = 1;

        while (p1 < nums.length) {
            if (nums[p1] + nums[p2] == target) {
                return new int[]{p1, p2};
            }
            p2++;
            if (p2 >= nums.length) {
                p1++;
                p2 = p1 + 1;
            }
        }
        return new int[]{0, 0};
    }
}
