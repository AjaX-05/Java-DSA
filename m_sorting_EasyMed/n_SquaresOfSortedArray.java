package com.dsa_bootcamp_assignments.m_sorting_EasyMed;

import java.util.Arrays;

public class n_SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
