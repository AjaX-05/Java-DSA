package com.dsa_bootcamp_assignments.P_Recursion.d_sorting;

import java.util.Arrays;

public class b_selectionSort {
    public static void main(String[] args) {
        int[] nums = {-3,2,-1,0,9,6,7,5,4,2,3};
        int row = nums.length - 1;
        int col = 0;
        int largestIndex = 0;
        sort(nums, row, col, largestIndex);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums, int row, int col, int largestIndex) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (nums[col] > nums[largestIndex]) {
                largestIndex = col;
            }
            sort(nums, row, col + 1, largestIndex);
        } else {
            if (nums[largestIndex] > nums[row]) {
                int temp = nums[largestIndex];
                nums[largestIndex] = nums[row];
                nums[row] = temp;
            }
            sort(nums, row - 1, 0, 0);
        }
    }
}
