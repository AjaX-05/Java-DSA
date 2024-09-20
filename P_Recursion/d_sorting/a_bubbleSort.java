package com.dsa_bootcamp_assignments.P_Recursion.d_sorting;

import java.util.Arrays;

public class a_bubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        int i = nums.length - 1;
        int j = 0;
        bubble(nums, i, j);
        System.out.println(Arrays.toString(nums));
    }

    static void bubble(int[] nums, int i, int j) {
        if (i < 0) {
            return;
        }
        if (j < i) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
            bubble(nums, i, j + 1);
        } else {
            bubble(nums, i - 1, 0);
        }
    }
}
