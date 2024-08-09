package com.dsa_bootcamp_assignments.i_searching_medium;

public class c_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 1, 2};
        int target = 6;

        int pivot = findPivot(nums);
        System.out.println(pivot);
        int findTarget = binarySearch(nums, target, 0, pivot);
        if (findTarget != -1) {
            System.out.println(findTarget);
        } else {
            findTarget = binarySearch(nums, target, pivot + 1, nums.length - 1);
            System.out.println(findTarget);
        }
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else if (nums[end] > nums[start]) {
                start = mid + 1;
            } else if (nums[end] < nums[mid + 1]) {
                end--;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
