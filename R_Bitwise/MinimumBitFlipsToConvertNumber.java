package com.dsa_bootcamp_assignments.R_Bitwise;

public class MinimumBitFlipsToConvertNumber {
    public static void main(String[] args) {
        int start = 3;
        int goal = 4;

        int flips = 0;
        int res = start ^ goal;
        while (res > 0){
            if ((res & 1) == 1){
                flips++;
            }
            res = res >> 1;
        }
        System.out.println(flips);
    }
}
