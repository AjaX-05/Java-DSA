package com.dsa_bootcamp_assignments.P_Recursion.b_ArrayConcepts;

public class b_linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};
        int target = 90;
        int i = arr.length-1;
        int res = search(arr, target, i);
        System.out.println(res);
    }


    static int search(int[] arr, int target, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return  search(arr, target, i - 1);
    }

//    static boolean search(int[] arr, int target, int i) {
//        if (i == -1) {
//            return false;
//        }
//        return arr[i] == target || search(arr, target, i - 1);
//    }

//    static int search(int[] arr, int target, int i) {
//        if (arr[i] == target) {
//            return i;
//        }
//        if (i == arr.length - 1) {
//            return -1;
//        }
//        return search(arr, target, i + 1);
//    }
}