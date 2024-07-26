package com.dsa_bootcamp_assignments.e_arrays;
//https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;

public class c_RunningSumof1dArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        runningSum(nums);
    }
    static boolean runningSum(int[] nums){
        int[] temp = new int[nums.length];
        int tempVal = 0;
        for (int i = 0; i < nums.length; i++) {
            tempVal += nums[i];
            temp[i] = tempVal;
        }
        System.out.println(Arrays.toString(temp));
        return  false;
    }
}
