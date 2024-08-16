package com.dsa_bootcamp_assignments.l_sortingAlgorithms;

import java.util.Arrays;

public class b_SelectionSort {

    public static void main(String[] args) {
        int[] nums = {1, 5, -9, 8, -7, 3};

        selection(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void selection(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - 1 - i;
            int max = maxIndex(nums, 0, last);
            swap(nums, max, last);
        }
    }

    static void swap(int[] nums, int max, int last) {
        int temp = nums[last];
        nums[last] = nums[max];
        nums[max] = temp;
    }

    static int maxIndex(int[] nums, int start, int end) {
        int maxIndex = start;

        for (int i = 0; i <= end; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

}
