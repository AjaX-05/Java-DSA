package com.dsa_bootcamp_assignments.e_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class e_ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = nums.length / 2;
//        System.out.println(n);
        System.out.println(Arrays.toString(func(nums, n)));
    }

    static int[] func(int[] nums, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = nums[i];
        }

        int counter = 0;
        for (int i = n; i < nums.length; i++) {
            arr2[counter] = nums[i];
            counter++;
        }

        int[] res = new int[nums.length];
        int counter2 = 0;
        int counter3 = 0;
        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0) {
                res[i] = arr1[counter2];
                counter2++;
            }
            if (i % 2 != 0) {
                res[i] = arr2[counter3];
                counter3++;
            }
        }

        return res;


    }
}