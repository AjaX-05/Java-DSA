package com.dsa_bootcamp_assignments.M_sorting_EasyMed;

import java.util.Arrays;


public class a_MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int res = sort(nums);
        System.out.println(res);
    }

    static int sort(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] != nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                return j;
            }
        }

        return nums.length;
    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }


}
