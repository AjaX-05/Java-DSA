package com.dsa_bootcamp_assignments.m_sorting_Easy;

import java.util.Arrays;

public class s_RankTransformOfAnArray {
    public static void main(String[] args) {
        int[] nums = {40, 10, 20, 30};
        mergeSort(nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
        int[] ranks = new int[nums.length];
        int rank = 1;
        int temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > temp) {
                rank++;
            }
            temp = nums[i];
            ranks[i] = rank;
        }



        System.out.println(Arrays.toString(ranks));
    }

    static void mergeSort(int[] nums, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = s + (e - s) / 2;

        mergeSort(nums, s, mid);
        mergeSort(nums, mid, e);

        mgSort(nums, s, e, mid);
    }

    static void mgSort(int[] nums, int s, int e, int m) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (nums[i] < nums[j]) {
                mix[k] = nums[i];
                i++;
            } else {
                mix[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i < m) {
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
