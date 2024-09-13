package com.dsa_bootcamp_assignments.m_sorting_Easy;

import java.util.Arrays;

public class k_sortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        bubble(nums);
        parity(nums);
        System.out.println(Arrays.toString(nums));
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

    static void parity(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] % 2 != 0) {
                    if (nums[j] % 2 == 0) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }

            }
        }
    }

}
