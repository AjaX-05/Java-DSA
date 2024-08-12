package com.dsa_bootcamp_assignments.k_binary_Search2DArraysConcepts;

import java.util.Arrays;

public class a_RowColSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 4, 29},
                {3, 12, 15, 33},
                {6, 18, 19, 36},
                {9, 20, 25, 40}
        };

        int target = 10;
        System.out.println(Arrays.toString(search(arr, target)));

    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r <= matrix.length - 1 && c >=0){
            if (matrix[r][c] == target){
                return new int[]{r,c};
            } else if (matrix[r][c] > target) {
                c--;
            }else {
                r++;
            }
        }

        return new int[]{-1, -1};
    }
}
