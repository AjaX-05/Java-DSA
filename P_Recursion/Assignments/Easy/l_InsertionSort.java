package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

import java.util.Arrays;

public class l_InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        int m = 1;
        int n = 1;

        insertionSort(nums, m, n);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionSort(int[] nums, int m, int n) {
        if (m > nums.length - 1) {
            return;
        }

        if (nums[n] < nums[n - 1]) {
            int temp = nums[n];
            nums[n] = nums[n - 1];
            nums[n - 1] = temp;
        }

        if (n > 1) {
            insertionSort(nums, m, n - 1);
        } else {
            insertionSort(nums, m + 1, m + 1);
        }
    }
}
