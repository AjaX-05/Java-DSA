package com.dsa_bootcamp_assignments.h_searching;

public class MergeTwo2DArrays {
    public static void main(String[] args) {
        int[][] nums1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] nums2 = {{1, 4}, {3, 2}, {4, 1}};

        sum(nums1, nums2);
    }

    static void sum(int[][] nums1, int[][] nums2) {
        for (int row = 0; row < nums1.length; row++) {
            for (int col = 0; col < nums1[row].length; col++) {
                nums1[row][col] = nums1[row][col] + nums2[row][col];
            }
        }
    }

}
