package com.dsa_bootcamp_assignments.g_searching_concepts;

public class f_MinOrMaxIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {23, 234, 3245, 253},
                {324, -324, -12, -123},
                {-969, 435, 321, 43}
        };

        System.out.println(((int) (Math.log10(12))+1)%2);
        System.out.println(minIn2DArr(arr));
        System.out.println(maxIn2DArr(arr));
    }

    static int minIn2DArr(int[][] arr) {
//        Assume the array is not empty

        int min = Integer.MAX_VALUE;
        for (int[] rows : arr) {
            for (int cols : rows) {
                if (cols < min) {
                    min = cols;
                }
            }
        }
        return min;
    }

    static int maxIn2DArr(int[][] arr) {

        int max = Integer.MIN_VALUE;
        for (int[] rows : arr) {
            for (int cols : rows) {
                if (cols > max) {
                    max = cols;
                }
            }
        }
        return max;
    }

}
