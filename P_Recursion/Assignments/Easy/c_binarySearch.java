package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class c_binarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int start = 0;
        int end = nums.length - 1;
        System.out.println(binarySearch(nums, start, end, -9));
    }

    static int binarySearch(int[] nums, int s, int e, int target) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (target == nums[mid]) {
            return mid;
        }
        if (target > nums[mid]) {
            return binarySearch(nums, mid + 1, e, target);
        } else {
            return binarySearch(nums, s, mid - 1, target);
        }
    }

}
