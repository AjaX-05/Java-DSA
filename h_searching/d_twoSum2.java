package com.dsa_bootcamp_assignments.h_searching;

import java.util.Arrays;

public class d_twoSum2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 9, 56, 90};
        int target = 8;

        System.out.println(Arrays.toString(find(nums, target)));
    }

    static int[] find(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
