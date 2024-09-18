package com.dsa_bootcamp_assignments.P_Recursion.b_ArrayConcepts;

public class d_RotatedSortedArrayBS {
    public static void main(String[] args) {
        int[] arr = {5, 1,3};
        int target = 5;

        int res = BS(arr, target, 0, arr.length - 1);
        System.out.println(res);
    }

    static int BS(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] >= arr[start]) {
            if (target >= arr[start] && target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid] && target <= arr[end]) {
                start = mid + 1;
            } else {
                start = mid + 1;
            }
        } else if (arr[start] > arr[mid]) {
            if (target <= arr[start] && target <= arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid] && target <= arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return BS(arr, target, start, end);
    }
}
