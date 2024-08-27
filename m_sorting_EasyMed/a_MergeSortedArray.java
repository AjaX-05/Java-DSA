package com.dsa_bootcamp_assignments.m_sorting_EasyMed;

import java.util.Arrays;

public class a_MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        mergedArr(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    static void mergedArr(int[] nums1, int m, int[] nums2, int n) {
        int start = m;
        int end = m + n;
        int temp = 0;

        for (int i = start; i < end; i++) {
            nums1[i] = nums2[temp];
            temp++;
        }
        insertion(nums1);
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
