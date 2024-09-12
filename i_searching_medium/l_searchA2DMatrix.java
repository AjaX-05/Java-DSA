package com.dsa_bootcamp_assignments.i_searching_medium;

import java.util.Arrays;

public class l_searchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 11;

        boolean tOrF = search(matrix, target);
        System.out.println(tOrF);
    }

    static boolean search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[r].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (target > matrix[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }
}
