package com.dsa_bootcamp_assignments.e_arrays;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number
import java.util.ArrayList;
import java.util.Arrays;

public class h_HowManyNumbersSmallThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerThan(nums)));
    }

    static int[] smallerThan(int[] nums){
        int p1 = 0;
        int p2 = 0;
        int counter = 0;
        int[] res = new int[nums.length];

        while (p1 < nums.length){
            if (nums[p1] > nums[p2]){
                counter++;
            }
            p2++;
            if (p2 == nums.length){
                res[p1] = counter;
                counter = 0;
                p1++;
                p2 = 0;
                if (p1 == nums.length){
                    break;
                }
            }
        }
        return res;
    }
}
