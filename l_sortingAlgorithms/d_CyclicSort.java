package com.dsa_bootcamp_assignments.l_sortingAlgorithms;

import java.util.Arrays;

public class d_CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3, 1,4, 2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; // initially 0
            if (nums[i] != nums[correctIndex]) { // 1 != 1
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    //    Cyclic Sort 0 - N
//    static void cyclic(int[] nums) {
//        int start = 0;
//        while (start < nums.length) {
//            if (nums[start] != start) {
//                int temp = nums[start];
//                nums[start] = nums[temp];
//                nums[temp] = temp;
//            } else {
//                start++;
//            }
//        }
//    }


//    Cyclic Sort 1 - N
//    static void cyclic(int[] nums) {
//        int start = 0;
//        while (start < nums.length) {
//            if (nums[start] != start + 1) {
//                int temp = nums[start];
//                nums[start] = nums[temp - 1];
//                nums[temp - 1] = temp;
//            } else {
//                start++;
//            }
//        }
//    }


}
