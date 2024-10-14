package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

import java.util.Arrays;

public class k_bubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1, 6};
        int n = nums.length - 1;
        int m = 0;

        bubbleSort(nums, m, n);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums, int m, int n) {
        if (n <= 0) {
            return;
        }

        if (nums[m] > nums[m + 1]) {
            int temp = nums[m];
            nums[m] = nums[m + 1];
            nums[m + 1] = temp;
        }

        if (m < n - 1) {
            bubbleSort(nums, m + 1, n);
        } else {
            bubbleSort(nums, 0, n - 1);
        }

    }
}
