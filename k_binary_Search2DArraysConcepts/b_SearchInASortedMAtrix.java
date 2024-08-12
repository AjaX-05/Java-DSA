package com.dsa_bootcamp_assignments.k_binary_Search2DArraysConcepts;

import java.util.Arrays;

public class b_SearchInASortedMAtrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 6;

        System.out.println(Arrays.toString(binarySearch(matrix, target)));


    }

//    static int[] linearSearch(int[][] matrix, int target) {
//
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                if (matrix[row][col] == target) {
//                    return new int[]{row, col};
//                }
//            }
//        }
//
//        return new int[]{-1, -1};
//    }

    static int[] binarySearch(int[][] matrix, int target) {

        int row = 0;
        int col = matrix.length - 1;
        while (row <= matrix.length - 1 && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
