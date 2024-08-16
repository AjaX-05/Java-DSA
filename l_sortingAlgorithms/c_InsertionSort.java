package com.dsa_bootcamp_assignments.l_sortingAlgorithms;

import java.util.Arrays;

public class c_InsertionSort {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,4};

        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertion(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
