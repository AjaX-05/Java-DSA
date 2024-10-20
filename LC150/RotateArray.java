package com.dsa_bootcamp_assignments.LC150;


import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        //TLE ERROR
        int[] nums = {-1, -100, 3, 99};
        int k = 2;

        for (int i = 0; i < k; i++) {
            int swapVal = nums[0];
            for (int j = 1; j < nums.length; j++) {
                if (j == nums.length - 1) {
                    int temp = nums[j];
                    nums[j] = swapVal;
                    swapVal = temp;
                    nums[0] = swapVal;
                    break;
                }
                int temp = nums[j];
                nums[j] = swapVal;
                swapVal = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
