package com.dsa_bootcamp_assignments.l_sortingAlgorithms;

import java.util.Arrays;

public class d_CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3, 1, 0, 2};
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }


    //    Cyclic Sort 0 - N
    static void cyclic(int[] nums) {
        int start = 0;
        while (start < nums.length) {
            if (nums[start] != start) {
                int temp = nums[start];
                nums[start] = nums[temp];
                nums[temp] = temp;
            } else {
                start++;
            }
        }
    }


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
