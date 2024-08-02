package com.dsa_bootcamp_assignments.g_searching_concepts;

public class h_binarySearchOrderAgnostic {

    public static void main(String[] args) {

//        int[] arr = {-3, -1, 0, 1, 2, 4, 6, 87, 567, 965};
        int[] arr = {950,750,600,500,0,-200,-350};
        int target = -200;

        int res = binarySearch(arr, target);
        System.out.println(res);
    }


    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[end] > arr[start]) {
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }

        if (arr[start] > arr[end]) {
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }


        return -1;
    }
}