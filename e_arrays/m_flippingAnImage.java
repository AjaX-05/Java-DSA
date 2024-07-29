package com.dsa_bootcamp_assignments.e_arrays;

import java.util.Arrays;

public class m_flippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };

        int[][] flipped = new int[image.length][image.length];

        for (int i = 0; i < image.length; i++) {
            int k = image.length-1;
            for (int j = 0; j < image.length; j++) {
                flipped[i][j] = image[i][k];
                if (flipped[i][j] == 1){
                    flipped[i][j] = 0;
                }else {
                    flipped[i][j] = 1;
                }
                k--;
            }
            k = image.length;
        }

//        for (int i = 0; i < image.length; i++) {
//            for (int j = 0; j < image.length; j++) {
//                if (flipped[i][j] == 1){
//                    flipped[i][j] = 0;
//                }else {
//                    flipped[i][j] = 1;
//                }
//            }
//        }
        System.out.println(Arrays.toString(flipped[3]));

    }
}
