package com.dsa_bootcamp_assignments.f_arrays_med_hard;

public class containerWithMostWater {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        arr(nums);
    }

    static void arr(int[] nums) {
        int i = 0;
        int j = 1;
        int p = 1;
        int temp = 0;

//        System.out.println(Math.min(nums[3] , nums[4]) * j );
        while (j < nums.length && (i < nums.length / 2)) {
            if (Math.min(nums[i], nums[j]) * p > temp) {
                temp = Math.min(nums[i], nums[j]) * p;
            }
            p++;
            j++;
            if (j == nums.length) {
                i++;
                j = i + 1;
                p = 1;
            }
        }

        System.out.println(temp);

    }
}