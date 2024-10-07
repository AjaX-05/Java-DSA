package com.dsa_bootcamp_assignments.LC150;

import java.util.Arrays;

public class a_MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        int i = 0;
        while (m < nums1.length) {
            nums1[m] = nums2[i];
            m++;
            i++;
        }
        quickSort(nums1, 0, nums1.length - 1);
        System.out.println(Arrays.toString(nums1));

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
