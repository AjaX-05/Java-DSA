package com.dsa_bootcamp_assignments.m_sorting_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class r_MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] nums = {40, 11, 26, 27, -20};
//        -20,11,26,27,40
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> newArr = new ArrayList<>();
        int tempIdx = 0;
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] < temp) {
                temp = nums[i + 1] - nums[i];
                List<Integer> tempArr = new ArrayList<>();
                tempArr.add(nums[i]);
                tempArr.add(nums[i + 1]);
                newArr.clear();
                newArr.add(tempArr);
            } else if (nums[i + 1] - nums[i] == temp) {
                temp = nums[i + 1] - nums[i];
                List<Integer> tempArr = new ArrayList<>();
                tempArr.add(nums[i]);
                tempArr.add(nums[i + 1]);
                newArr.add(tempArr);
            }
        }
        System.out.println(newArr);
    }

    static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;

        int mid = s + (e - s) / 2;
        int pivot = nums[mid];

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