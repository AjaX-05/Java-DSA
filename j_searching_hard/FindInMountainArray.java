package com.dsa_bootcamp_assignments.j_searching_hard;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] nums = {0,5,3,1};
        int target = 1;

        System.out.println(peakIndex(nums, target));
    }

    static int peakIndex(int[] nums, int target) {
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

//        System.out.println(start);
//        This is the Peak Index of the Bitonic Array / Mountain Array

//        Searches the first part
        int tempPeakIndex = start;
        int newEnd = tempPeakIndex;
        start = 0;
        while (start <= newEnd) {
            int mid = start + (newEnd - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                newEnd = mid - 1;
            }

            if (target == nums[mid]) {
                return mid;
            }
        }


//        Searches the second part
        start = tempPeakIndex + 1;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                start = mid + 1;
            } else if (target > nums[mid]) {
                end = mid - 1;
            }

            if (target == nums[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
