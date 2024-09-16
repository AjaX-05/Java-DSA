package com.dsa_bootcamp_assignments.e_arrays;

import java.util.ArrayList;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {-1};

        ArrayList<String> result = check(nums);
        System.out.println(result);
    }

    static ArrayList<String> check(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        int i = 0;
        int j = 1;
        int end = nums.length;

        if (nums.length == 1) {
            res.add("" + nums[0]);
            return res;
        }

        while (i < nums.length - 1 && j < nums.length) {
            if (nums[j] - nums[j - 1] == 1) {
                j++;
            } else if (nums[j] - nums[j - 1] != 1) {
                if (i == j - 1) {
                    res.add(nums[j - 1] + "");
                    i = j;
                    j++;
                } else {
                    res.add(nums[i] + "->" + nums[j - 1]);
                    i = j;
                    j++;
                }
            }

            if (j == end) {
                if (i == j - 1) {
                    res.add(nums[i] + "");
                } else {
                    res.add(nums[i] + "->" + nums[j - 1]);
                }
            }
        }
        return res;
    }
}
