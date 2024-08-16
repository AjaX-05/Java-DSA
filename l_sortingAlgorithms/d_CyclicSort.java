package com.dsa_bootcamp_assignments.l_sortingAlgorithms;

import java.util.Arrays;

public class d_CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 4};
        cyclic(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void cyclic(int[] nums) {

        int start = 0;
        while (start < nums.length) {
            if (nums[start] != start + 1) {
                int temp = nums[start];
                nums[start] = nums[temp - 1];
                nums[temp - 1] = temp;
            } else {
                start++;
            }
        }
    }
}
