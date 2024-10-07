package com.dsa_bootcamp_assignments.e_arrays;

import javax.swing.text.AsyncBoxView;
import java.util.ArrayList;

public class f_KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] nums = {12,1,12};
        int extraCandies = 1;

        int highest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > highest) {
                highest = nums[i];
            }
        }
        ArrayList<Boolean> res = new ArrayList<>();
        for (int num : nums) {
            if (num + extraCandies >= highest) {
                res.add(true);
            } else {
                res.add(false);
            }
        }

        System.out.println(highest);
        System.out.println(res);
    }
}
