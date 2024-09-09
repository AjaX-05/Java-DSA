package com.dsa_bootcamp_assignments.Q_MathForDSA;

public class b_findElementWhichDosentAppearTwice {
    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 4, 5, 1, 4};
        int res = uniqueElement(nums);
        System.out.println(res);
    }

    static int uniqueElement(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = num ^ res;
        }
        return res;
    }
}
