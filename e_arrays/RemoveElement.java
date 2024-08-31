package com.dsa_bootcamp_assignments.e_arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int res = removeInPlace(nums, val);
        System.out.println(res);
    }

    static int removeInPlace(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                counter++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == val ) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        counter = nums.length - counter;
        System.out.println(Arrays.toString(nums));
        return counter;
    }

}
