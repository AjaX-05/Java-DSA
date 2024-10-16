package com.dsa_bootcamp_assignments.h_searching;

public class j_peakIndexInAMountainArray2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 3, 1};
        System.out.println(peakIndex(nums));
    }

    static int peakIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
