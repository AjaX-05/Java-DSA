package com.dsa_bootcamp_assignments.h_searching;

import java.util.Arrays;

public class k_CountNEgativeNosInSortedMAtrix {
    public static void main(String[] args) {
        int grid[][] = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };

        System.out.println(search(grid));
    }

    static int search(int[][] grid) {
        int counter = 0;

        for (int x = 0; x <= grid.length - 1; x++) {
            for (int y = grid[x].length - 1; y >= 0; y--) {
                if (grid[x][y] < 0) {
                    counter++;
                } else {
                    break;
                }
            }
        }

        return counter;
    }


}