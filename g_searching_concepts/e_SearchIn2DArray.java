package com.dsa_bootcamp_assignments.g_searching_concepts;

import java.lang.reflect.Array;
import java.util.Arrays;

public class e_SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 14, 43, 535, 34},
                {432, 32, 543, 23},
                {342, 324, 76, 87},
                {34, 1, 231},
                {999}
        };

        int target = 1;
//        System.out.println(Arrays.toString(arr[0]));
        int[] res = search(arr, target);
        System.out.println(Arrays.toString(res));
//        System.out.println(search2(arr, target));
    }

    static int[] search(int[][] nums, int target) {

//        Assume array is not empty;
//        Returns result as [row,col]
        for (int rows = 0; rows < nums.length; rows++) {
            for (int cols = 0; cols < nums[rows].length; cols++) {
                if (nums[rows][cols] == target) {
                    return new int[]{rows, cols};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static boolean search2(int[][] nums, int target) {

//        Assume array is not empty;

        for (int rows = 0; rows < nums.length; rows++) {
            for (int cols = 0; cols < nums[rows].length; cols++) {
                if (nums[rows][cols] == target) {
                    System.out.println("Row:" + rows + ", Col:" + cols);
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }
}

