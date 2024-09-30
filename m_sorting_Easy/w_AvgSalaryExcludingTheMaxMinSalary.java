package com.dsa_bootcamp_assignments.m_sorting_Easy;

import java.util.Arrays;

public class w_AvgSalaryExcludingTheMaxMinSalary {
    public static void main(String[] args) {
        int[] nums = {4000, 3000, 1000, 2000};
        mergeSort(nums, 0, nums.length);
//        System.out.println(Arrays.toString((nums)));

        double salary = 0;
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            salary += nums[i];
            count++;
        }
        double res = salary / count;
        System.out.println(res);

    }

    static void mergeSort(int[] nums, int s, int e) {
        if (e - s < 2) {
            return;
        }

        int mid = s + (e - s) / 2;

        mergeSort(nums, s, mid);
        mergeSort(nums, mid, e);

        sort(nums, s, e, mid);
    }

    static void sort(int[] nums, int s, int e, int mid) {
        int[] mix = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;
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
            nums[l + s] = mix[l];
        }

    }
}
