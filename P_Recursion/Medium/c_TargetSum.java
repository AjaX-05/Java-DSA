package com.dsa_bootcamp_assignments.P_Recursion.Medium;

import java.util.ArrayList;

//TLE ERROR in LC. Need DP
public class c_TargetSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;

        ArrayList<Integer> res = sum(0, nums, 0, target);
        System.out.println(res);
        System.out.println(res.size());
    }

    static ArrayList<Integer> sum(int p, int[] nums, int i, int target) {
        if (p == target && i == nums.length) {
            ArrayList<Integer> res = new ArrayList<>();
            res.add(target);
            return res;
        }
        ArrayList<Integer> res = new ArrayList<>();
        if (p > target || i == nums.length) {
//            System.out.println(p);
            return res;
        }
        int t = nums[i];
        res.addAll(sum(p + nums[i], nums, i + 1, target));
        res.addAll(sum(p - nums[i], nums, i + 1, target));

        return res;
    }
}