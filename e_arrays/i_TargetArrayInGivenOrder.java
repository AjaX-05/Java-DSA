package com.dsa_bootcamp_assignments.e_arrays;
//https://leetcode.com/problems/create-target-array-in-the-given-order/
import java.util.ArrayList;
import java.util.Arrays;

public class i_TargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        ArrayList<Integer> res = new ArrayList<>(nums.length);
        int[] resFinal = new int[nums.length];


        for (int i = 0; i < index.length; i++) {
            res.add(index[i],nums[i]);
        }
        for (int i = 0; i < res.size(); i++) {
            resFinal[i] = res.get(i);
        }


        System.out.println(Arrays.toString(resFinal));
    }
}
