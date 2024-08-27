package com.dsa_bootcamp_assignments.m_sorting_EasyMed;

import java.util.Arrays;

public class e_setMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        int[] mismatch = sort(nums);
        System.out.println(Arrays.toString(mismatch));
    }

    static int[] sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[]{nums[j], j + 1};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
