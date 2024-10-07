package com.dsa_bootcamp_assignments.m_sorting_Easy;

public class za_SpecialArrayWithXElemntsGreaterThanOrEqualX {
    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 7, 0};
        int res = func(nums);
        System.out.println(res);
    }

    static int func(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int i = 0;
        int j = 0;
        int count = 0;
        while (i <= max) {
            if (nums[j] >= i) {
                count++;
            }
            j++;
            if (j >= nums.length) {
                if (count == i) {
                    return count;
                }
                i++;
                j = 0;
                count = 0;
            }
        }
        return -1;
    }
}
