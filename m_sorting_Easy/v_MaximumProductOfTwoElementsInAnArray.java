package com.dsa_bootcamp_assignments.m_sorting_Easy;

import java.util.Arrays;

public class v_MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 2};
        quickSort(nums, 0, nums.length - 1);
        int res = (nums[0] - 1) * (nums[1] - 1);
        System.out.println(res);
    }

    static void quickSort(int[] nums, int low, int hi) {
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

//        Base Case
        if (e <= s) {
            return;
        }

        while (s <= e) {
            while (nums[s] > pivot) {
                s++;
            }
            while (nums[e] < pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(nums, low, e);
        quickSort(nums, s, hi);

    }
}
