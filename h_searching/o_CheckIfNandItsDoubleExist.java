package com.dsa_bootcamp_assignments.h_searching;

public class o_CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {7,1,14,11};
//        int[] arr = {0,0};

        boolean res = checkDoubleExists(arr);
        System.out.println(res);
    }

    static boolean checkDoubleExists(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            for (int e = 0; e < nums.length; e++) {
                if (start == e) {
                    continue;
                }
                if (nums[start] * 2 == nums[e]) {
                    System.out.println(nums[start] + "," + e);
                    return true;
                }
            }
            start++;
        }
        return false;
    }

}