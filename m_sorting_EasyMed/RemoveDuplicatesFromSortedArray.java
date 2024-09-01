package com.dsa_bootcamp_assignments.m_sorting_EasyMed;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int res = duplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(res);
    }

    static int duplicates(int[] nums) {
        int inVal = nums[0];
        int inInd = 0;
        int counter = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= nums.length - 1; j++) {
                if (nums[j] > inVal) {
                    nums[inInd + 1] = nums[j];
                    inInd = inInd + 1;
                    inVal = nums[j];
                    counter++;
                }
            }
        }
        return counter;
    }
}