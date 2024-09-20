package com.dsa_bootcamp_assignments.P_Recursion.d_sorting;

import java.util.Arrays;

public class lc_sortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int i = nums.length - 1;
        int j = 0;
        sort(nums, i, j);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums, int i, int j) {
        if (i < 0) {
            return;
        }
        if (j < i) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
            sort(nums, i, j + 1);
        } else {
            sort(nums, i - 1, 0);
        }
    }
}
