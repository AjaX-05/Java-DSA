package com.dsa_bootcamp_assignments.h_searching;

import java.util.Arrays;

public class d_twoSum2 {
    public static void main(String[] args) {
        int[] nums = {5,25,75};
        int target = 100;

        System.out.println(Arrays.toString(find(nums, target)));
    }

    static int[] find(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int bTarget = target - nums[i];

            int start = i + 1;
            int end = nums.length-1;
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] > bTarget) {
                    end = mid - 1;
                } else if (nums[mid] < bTarget) {
                    start = mid + 1;
                }

                if (nums[mid] == bTarget) {
                    return new int[]{i, mid};
                }
            }
        }
        return new int[]{-1, -1};
    }
}