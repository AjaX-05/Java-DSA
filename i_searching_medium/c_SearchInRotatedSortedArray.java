package com.dsa_bootcamp_assignments.i_searching_medium;

public class c_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {8,9,2,3,4};
        int target = 9;

        int pivot = findPivot(nums);
        System.out.println(pivot);
        if (pivot == -1) {
            System.out.println((binarySearch(nums, target, 0, nums.length-1)));
        } else {
            if (target == nums[pivot]) {
                System.out.println(pivot);
            } else if (target >= nums[0]) {
                System.out.println(binarySearch(nums, target, 0, pivot));
            } else {
                System.out.println(binarySearch(nums, target, pivot + 1, nums.length-1));
            }
        }


    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid + 1 <= end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid - 1 >= start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
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
