package com.dsa_bootcamp_assignments.P_Recursion.Assignment.Easy;

import java.util.Arrays;

public class a_SumTriangleFromArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        triangle(nums);
    }

    static void triangle(int[] nums) {
        if (nums.length < 1) {
            return;
        }
        int[] n = new int[nums.length - 1];
        for (int i = 0; i < n.length; i++) {
            n[i] = nums[i] + nums[i + 1];
        }
        triangle(n);
        System.out.println(Arrays.toString(nums));

    }
}
