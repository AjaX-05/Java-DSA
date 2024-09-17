package com.dsa_bootcamp_assignments.P_Recursion.b_ArrayConcepts;

public class a_sortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        boolean res = isSort(arr, 0);
        System.out.println(res);
    }

    static boolean isSort(int[] arr, int i) {
//        base condition
        if (i == arr.length - 1) {
            return true;
        }

        return arr[i] < arr[i + 1] && isSort(arr, i + 1);
    }
}