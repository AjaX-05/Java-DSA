package com.dsa_bootcamp_assignments.g_searching_concepts;

public class d_findMinNum {
    public static void main(String[] args) {
        int[] arr = {-595, 1, 32, 45, 6, 3, 23, 5, -346, -435, -4, 2, 989};

        int res = searchMin(arr);
        System.out.println(res);
    }

    static int searchMin(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
