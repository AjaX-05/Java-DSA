package com.dsa_bootcamp_assignments.e_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class findClosestNumberToZero {
    public static void main(String[] args) {
        int[] nums = {2,-1,1};
        Arrays.sort(nums);

        int n = nums[nums.length - 1];

        ArrayList res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = nums[i] * -1;
                n = nums[i];
                res.add(nums[i] * -1);
            } else if (nums[i] <= n) {
                n = nums[i];
                res.add(nums[i]);
            }
        }


        System.out.println(Arrays.toString(nums));
        System.out.println((int)res.get(res.size()-1));

    }
}
