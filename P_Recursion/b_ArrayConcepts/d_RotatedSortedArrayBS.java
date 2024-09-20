package com.dsa_bootcamp_assignments.P_Recursion.b_ArrayConcepts;

public class d_RotatedSortedArrayBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        int target = 6;

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

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return BS(arr, target, start, mid - 1);
            } else {
                return BS(arr, target, mid + 1, end);
            }
        }

        if (target >= arr[mid] && target <= arr[end]) {
            return BS(arr, target, mid + 1, end);
        }
        return BS(arr, target, start, mid - 1);


//        if (arr[mid] >= arr[start]) {
//            if (target >= arr[start] && target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid] && target <= arr[end]) {
//                start = mid + 1;
//            } else {
//                start = mid + 1;
//            }
//        } else if (arr[start] > arr[mid]) {
//            if (target <= arr[start] && target <= arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid] && target <= arr[end]) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return BS(arr, target, start, end);
    }
}