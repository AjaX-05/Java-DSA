package com.dsa_bootcamp_assignments.m_sorting_EasyMed;

import java.util.ArrayList;
import java.util.Arrays;

class b_findAllNumbersDisappearedInAnArray<List> {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static ArrayList<Integer> sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; // initially 0
            if (nums[i] != nums[correctIndex]) { // 1 != 1
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
//                System.out.println(j + 1);
                res.add(j + 1);
            }
        }

//        System.out.println(res);
        return res;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}