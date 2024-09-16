package com.dsa_bootcamp_assignments.Q_MathForDSA;

public class elementThatThriceExceptOneElement_Find {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2, 4, 4, 4, 7, 7, 7};

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res + nums[i];
        }

        System.out.println(res%3);
    }
}
