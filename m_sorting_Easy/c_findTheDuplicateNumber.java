package com.dsa_bootcamp_assignments.m_sorting_Easy;

import java.util.Arrays;

public class c_findTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {};
        int res = sort(nums);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }

    static int sort(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        int missing = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 != j) {
//                System.out.println(nums[j]);
                missing = nums[j];
            }
        }
        return missing;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
