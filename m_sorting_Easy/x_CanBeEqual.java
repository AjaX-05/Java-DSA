package com.dsa_bootcamp_assignments.m_sorting_Easy;

import java.util.Arrays;

public class x_CanBeEqual {
    public static void main(String[] args) {
        int[] target = {1, 2, 3, 4};
        int[] arr = {2, 4, 1, 3};
        quickSort(target, 0, target.length - 1);
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(target));
        System.out.println(Arrays.toString(arr));
        if (Arrays.equals(arr,target)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    static void quickSort(int[] nums, int low, int high) {
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        if (s >= e) {
            return;
        }

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
        quickSort(nums, low, e);
        quickSort(nums, s, high);

    }

}