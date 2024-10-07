package com.dsa_bootcamp_assignments.LC150;

import java.util.Arrays;

public class d_RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        removeDups(nums);
        quickSort(nums, 0, nums.length - 1);

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < Integer.MAX_VALUE) {
                res++;
            }
        }
        System.out.println(res);
    }

    static void removeDups(int[] nums) {
        int i = 0;
        int unqIdx = 0;
        int count = 1;

        while (i < nums.length) {
            if (nums[unqIdx] != nums[i]) {
                count = 1;
                unqIdx = i;
            }
            if (count > 2 && nums[i] == nums[unqIdx]) {
                nums[i] = Integer.MAX_VALUE;
            } else {
                count++;
            }
            i++;
        }
    }

    static void quickSort(int[] nums, int lo, int hi) {
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
