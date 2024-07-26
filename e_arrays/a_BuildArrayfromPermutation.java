package com.dsa_bootcamp_assignments.e_arrays;
//https://leetcode.com/problems/build-array-from-permutation/
import java.util.Arrays;

public class a_BuildArrayfromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(Permutation(nums)));

    }

    static int[] Permutation(int[] nums){
        int[] temp = new int[6];
        for (int i = 0; i < nums.length; i++) {
//            System.out.println(temp[i]);
            temp[i] = nums[nums[i]] ;
//            System.out.println(gg);
        }
//        System.out.println(Arrays.toString(temp));
        return temp;
    }

}
