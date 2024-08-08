package com.dsa_bootcamp_assignments.h_searching;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class j_peakIndexInAMountainArray {
    public static void main(String[] args) {
//        int[] arr = {0, 10, 20, 30, 40, 45, 50, 5, 0};
        int[] arr = {3,5,3,2,0};
//        int[] arr = {0, 1, 0};
        System.out.println(binarySearch(arr));
    }

    static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid-1 >0 && arr[mid] > arr[mid - 1] && arr[mid + 1] < arr[mid]) {
                start = mid;
                end = mid;
            }

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

            if (mid-1 >0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            }

        }
        return start;
    }
}