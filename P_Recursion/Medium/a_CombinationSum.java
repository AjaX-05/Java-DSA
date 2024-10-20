package com.dsa_bootcamp_assignments.P_Recursion.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class a_CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        comb(candidates, target, 0, 0, arr, new ArrayList<Integer>());
        System.out.println(arr);
    }

    public static void comb(int[] candidates, int target, int sum, int i, ArrayList<ArrayList<Integer>> big, ArrayList<Integer> small) {
        if (sum == target) {
            big.add(new ArrayList<>(small));
            return;
        }

        if (sum > target) {
            return;
        }

        for (int j = i; j < candidates.length; j++) {
            small.add(candidates[j]);
//            System.out.println(small);
            comb(candidates, target, sum + candidates[j], j , big, small);
            small.remove(small.size() - 1);
        }
    }
}
