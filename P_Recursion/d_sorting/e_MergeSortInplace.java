package com.dsa_bootcamp_assignments.P_Recursion.d_sorting;

import java.util.Arrays;

public class e_MergeSortInplace {
    public static void main(String[] args) {
        int[] nums = {5 , 3 , 1 ,2 ,0};
        mergeSortIP(nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));

    }

    static void mergeSortIP(int[] nums, int s, int e) {
        if (e-s == 1) {
            return;
        }

        int mid = s + (e - s) / 2;

        mergeSortIP(nums, s, mid);
        mergeSortIP(nums, mid, e);

        mergeIP(nums, s, mid, e);

    }

    static void mergeIP(int[] nums, int s, int mid, int e) {
        int i = s;
        int j = mid;

        int k = 0;
        int[] mix = new int[e-s];

        while (i < mid && j < e) {
            if (nums[i] < nums[j]) {
                mix[k] = nums[i];
                i++;
            } else {
                mix[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = nums[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = nums[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            nums[s + l] = mix[l];
        }
    }
}
