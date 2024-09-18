package com.dsa_bootcamp_assignments.P_Recursion.b_ArrayConcepts;

import java.util.ArrayList;

public class c_linearSearchMultipleOccurrences {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,6,7,8};
        int target = 6;
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> res = search2(arr, target, 0);

        System.out.println(res);
    }

    static ArrayList<Integer> search(int[] arr, int target, int i, ArrayList<Integer> arr2) {
        if (i == arr.length) {
            return arr2;
        }
        if (arr[i] == target) {
            arr2.add(i);
        }
        return search(arr, target, i + 1, arr2);
    }

    static ArrayList<Integer> search2(int[] arr, int target, int i) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        if (i == arr.length) {
            return arr2;
        }
        if (arr[i] == target) {
            arr2.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = search2(arr, target, i + 1);

        arr2.addAll(0,ansFromBelowCalls);
        return arr2;
    }
}