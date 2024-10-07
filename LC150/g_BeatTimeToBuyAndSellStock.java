package com.dsa_bootcamp_assignments.LC150;

import java.util.ArrayList;

public class g_BeatTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int max = 0;
        for (int i = 0, min = prices[0]; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
    }
}
