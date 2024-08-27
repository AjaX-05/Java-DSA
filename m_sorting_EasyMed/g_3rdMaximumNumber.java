package com.dsa_bootcamp_assignments.m_sorting_EasyMed;

import java.util.Arrays;

public class g_3rdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(thirdMax(nums));
    }

    static void bubble(int[] arr) {
        boolean swapped;
//        run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;

//            for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
//                swap if the item is smaller than previous item
                if (arr[j] < arr[j - 1]) {
//                    swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

//            if you did not swap for a particular value of i, it means the array is sorted hence stop the program.
            if (!swapped) {
                break;
            }
        }
    }

    static int thirdMax(int[] nums) {
        int counter = 0;
        int num = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < num) {
                counter++;
                num = nums[i];
                if (counter == 2) {
                    return num;
                }

            }
        }

        return nums[nums.length - 1];
    }
}