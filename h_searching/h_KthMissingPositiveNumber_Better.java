package com.dsa_bootcamp_assignments.h_searching;

import java.util.ArrayList;
import java.util.Arrays;

public class h_KthMissingPositiveNumber_Better {
    public static void main(String[] args) {
        int k = 5;
        int[] arr = {2, 3, 4, 7, 11};

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = arr[arr.length - 1] + k + 1;

        ArrayList<Integer> res = totalArr(newArr, k);

        System.out.println(res.get(k - 1));

    }

    static ArrayList<Integer> totalArr(int[] arr, int k) {
        int start = 0;

        ArrayList<Integer> missingElements = new ArrayList<>();
        int element = 1;

        while (start < arr.length) {
            if (arr[start] != element) {
                missingElements.add(element);
            } else {
                start++;
            }
            element++;
        }

        return missingElements;
    }
}
