package com.dsa_bootcamp_assignments.P_Recursion.Assignment.Easy;

public class c_binarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 13;
        System.out.println(binarySearch(nums, target, 0, nums.length - 1));
    }

    static int binarySearch(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;

        if (nums[mid] == target) {
            return mid;
        }


        if (target < nums[mid]) {
            return binarySearch(nums, target, s, mid - 1);
        } else if (target > nums[mid]) {
            return binarySearch(nums, target, mid + 1, e);
        }
        return -1;
    }
}
