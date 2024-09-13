package com.dsa_bootcamp_assignments.m_sorting_Easy;

import java.util.Arrays;

public class a_MergeSortedArray2 {

    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;

        int index = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[index];
            index++;
        }

        System.out.println(Arrays.toString(nums1));
        sort(nums1);
        System.out.println(Arrays.toString(nums1));

    }

    static void sort(int[] nums1) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 1; j <= nums1.length - 1; j++) {
                if (nums1[j] < nums1[j - 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = temp;
                }
            }
        }
    }
}
