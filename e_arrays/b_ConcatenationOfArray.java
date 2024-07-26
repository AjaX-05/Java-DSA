package com.dsa_bootcamp_assignments.e_arrays;
//https://leetcode.com/problems/concatenation-of-array/
import java.util.ArrayList;
import java.util.Arrays;

public class b_ConcatenationOfArray {
    public static void main(String[] args) {
        res(new int[]{1,2,1});
    }

//    static boolean res(int[] nums) {
//        ArrayList<Integer> temp = new ArrayList<Integer>();
//        for (int num : nums) {
//            temp.add(num);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            temp.add(nums[i]);
//        }
//        System.out.println(temp);
//        return false;
//    }
    static boolean res(int[] nums) {
        int[] temp = new int[2* nums.length];
        for (int i = 0; i < nums.length; i++) {
         temp[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            temp[i+nums.length] = (nums[i]);
        }
        System.out.println(Arrays.toString(temp));
        return false;
    }
}