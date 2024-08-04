package com.dsa_bootcamp_assignments.h_searching;
//https://leetcode.com/problems/search-insert-position/
public class i_searchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 6;
        System.out.println(searchPosition(nums, target));
    }

    static int searchPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                return mid;
            }
        }
        return start;
    }
}
