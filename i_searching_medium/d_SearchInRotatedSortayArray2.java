package com.dsa_bootcamp_assignments.i_searching_medium;

public class d_SearchInRotatedSortayArray2 {
//
//    public static void main(String[] args) {
//
//        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
//        int pivot = findPivot(nums);
//        System.out.println(pivot);
//        int target = 0;
//
//        int res = -1;
//        if (pivot == -1) {
//            res = binarySearch(nums, target, 0, nums.length - 1);
//            if (res != -1) {
//                System.out.println(true);
////                return
//            }
//        }
//
//        if (pivot == target) {
//            res = target;
//            if (res != -1) {
//                System.out.println(true);
////                return
//            }
//        } else if (pivot > nums[0]) {
//            res = binarySearch(nums, target, 0, pivot);
//            if (res != -1) {
//                System.out.println(true);
////                return
//            }
//        } else {
//            res = binarySearch(nums, target, pivot + 1, nums.length - 1);
//            if (res != -1) {
//                System.out.println(true);
////                return
//            }
//        }
//
//    }
//
//    static int findPivot(int[] nums) {
//        int start = 0;
//        int end = nums.length - 1;
//
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            if (mid + 1 <= end && nums[mid] > nums[mid + 1]) {
//                return mid;
//            } else if (mid - 1 >= 0 && nums[mid] < nums[mid - 1]) {
//                return mid - 1;
//            }
//
//            if (nums[start] == nums[mid] && nums[start] == nums[end]) {
//                if (nums[start] > nums[start + 1]) {
//                    return start;
//                }
//                start++;
//                if (nums[end] < nums[end - 1]) {
//                    return end - 1;
//                }
//                end--;
//            }
//
//            if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] < nums[end]) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
//
//    static int binarySearch(int[] arr, int target, int start, int end) {
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (target > arr[mid]) {
//                start = mid + 1;
//            } else if (target < arr[mid]) {
//                end = mid - 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
}