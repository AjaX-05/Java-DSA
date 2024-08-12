package com.dsa_bootcamp_assignments.i_searching_medium;

public class rotaton_count_in_rotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        int peakElement = pivot(nums);

        int totalRotations = peakElement + 1;
        System.out.println(totalRotations);
    }

    static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid + 1 <= end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid - 1 >= 0 && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
