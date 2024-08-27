package com.dsa_bootcamp_assignments.m_sorting_EasyMed;

import java.util.*;

public class d_findAllDuplicatesInAnArray {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        ArrayList<Integer> duplicatesList = sort(nums);
        System.out.println(duplicatesList);
    }

    static ArrayList<Integer> sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        ArrayList<Integer> duplicatesList = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
//                System.out.println(j + 1);
                duplicatesList.add(nums[j]);
            }
        }

        return duplicatesList;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
