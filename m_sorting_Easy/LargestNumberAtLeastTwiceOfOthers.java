package com.dsa_bootcamp_assignments.m_sorting_Easy;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};

        int[] sorted = mergeSort(nums);
        int res = checkTwice(sorted);

        if (res != -1){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == res){
                    System.out.println(i);
                }
            }
        }
//        return -1;
    }

    static int checkTwice(int[] nums) {
        int largest = nums[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            if (largest >= nums[i] * 2) {
//                System.out.println(true);
            } else {
                return -1;
            }
        }

        return largest;
    }

    static int[] mergeSort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int s = 0;
        int e = nums.length;
        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, s, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, e));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int mix[] = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;

    }
}
