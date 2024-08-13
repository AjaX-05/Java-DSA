package com.dsa_bootcamp_assignments.h_searching;

import java.util.Arrays;

public class n_fairCandySwap {
    //https://leetcode.com/problems/fair-candy-swap/

//class Solution {
//    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
//        int aliceTotal = 0;
//        int bobTotal = 0;
//        for (int i = 0; i < aliceSizes.length; i++) {
//            aliceTotal += aliceSizes[i];
//        }
//        for (int i = 0; i < bobSizes.length; i++) {
//            bobTotal += bobSizes[i];
//        }
//        int totalExchangeVal = (aliceTotal + bobTotal) / 2;
//
//        for (int i = 0; i < aliceSizes.length; i++) {
//            for (int j = 0; j < bobSizes.length; j++) {
//                if (bobSizes[j] + (aliceTotal - aliceSizes[i]) == totalExchangeVal) {
//                    return new int[] { aliceSizes[i], bobSizes[j] };
//                }
//            }
//        }
//        return new int[] {-1,-1};
//    }
//}
}