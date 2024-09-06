package com.dsa_bootcamp_assignments.i_searching_medium;

public class e_MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,1};
        int res = bS(nums);
        System.out.println(res);
    }

    static int bS(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[end] < nums[start] && nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}