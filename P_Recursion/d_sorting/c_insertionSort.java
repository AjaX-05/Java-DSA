package com.dsa_bootcamp_assignments.P_Recursion.d_sorting;

import java.util.Arrays;

public class c_insertionSort {
    public static void main(String[] args) {
        int[] nums = {-3, 99, 9, 4, 5, 3, 2, -9};
        int i = 0;
        int j = i + 1;

        sort(nums, i, j);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums, int i, int j) {

        if (i == nums.length) {
            return;
        }

        if (j > 0) {
            if (nums[j - 1] > nums[j]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;

            }
            sort(nums, i, j - 1);
        } else {
            sort(nums, i + 1, i + 1);
        }

    }
}
