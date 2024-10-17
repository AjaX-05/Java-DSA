package com.dsa_bootcamp_assignments.P_Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class a_CombinationSum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> outer = new ArrayList<>();
        combinations(nums, target, 0, 0, new ArrayList<>(), outer);
        System.out.println(outer);
    }

    static void combinations(int[] nums, int t, int sum, int idX, ArrayList<Integer> inner, List<List<Integer>> outer) {
        if (sum == t) {
            outer.add(new ArrayList<>(inner));
            return;
        }

        if (sum > t) {
            return;
        }

        for (int i = idX; i < nums.length; i++) {
            inner.add(nums[i]);
            System.out.println(inner);
            combinations(nums, t, sum + nums[i], i, inner, outer);
            inner.remove(inner.size() - 1);
        }

    }

}
