package com.dsa_bootcamp_assignments.i_searching_medium;

import java.util.Arrays;
import java.util.OptionalInt;

public class splitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 1;
        System.out.println(splitArray(nums, k));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
//            if (nums[i] > start) {
//                start = nums[i];
//            }
//            Or
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }

//        binary search
        while (start < end) {
//            try for the middle as potential answer
            int mid = start + (end - start) / 2;

//            calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum = sum + num;
                }
            }
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }


        return end; // or end since start == end
    }


}
