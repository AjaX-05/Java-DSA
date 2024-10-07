package com.dsa_bootcamp_assignments.LC150;

import java.util.Arrays;

public class c_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 2, 3, 3};
        removeDup(nums);

        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < Integer.MAX_VALUE) {
                res++;
            }
        }
        System.out.println(res);
    }

    static void removeDup(int[] nums) {
        int i = 0;
        int uniqIdx = 0;
        int count = 1;
        while (i < nums.length) {
            if (count > 1 && nums[i] == nums[uniqIdx]) {
                nums[i] = Integer.MAX_VALUE;
            } else {
                uniqIdx = i;
                count++;
            }
            i++;
        }
    }

    static void quickSort(int nums[], int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int s = lo;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
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

        quickSort(nums, lo, e);
        quickSort(nums, s, hi);

    }
}
