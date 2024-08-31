package com.dsa_bootcamp_assignments.m_sorting_EasyMed;

import java.util.Arrays;

public class l_sortArrayByParity2 {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1};
        bubbleSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {

                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {
                    res[i] = nums[j];
                    break;
                }
            }

        }

        System.out.println(Arrays.toString(res));

    }
}
