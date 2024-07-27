package com.dsa_bootcamp_assignments.e_arrays;

public class g_NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int res = goodPairs(nums);
        System.out.println(res);
    }

    static int goodPairs(int[] nums){
        int originalSize = nums.length-1;
        int size = originalSize;
        int p1 = 0;
        int p2 = 1;
        int res = 0;
        while (size > 0){
            if (nums[p1] == nums[p2]){
//                System.out.println(p1 +", " +p2);
                res++;
            }
            p2++;
            size--;
            if (p2 == nums.length-1){
                if (nums[p1] == nums[p2]){
//                    System.out.println(p1 +", " +p2);
                    res++;
                }
                p1++;
                p2 = p1+1;
                originalSize--;
                size = originalSize;
            }
        }
        return res;
    }
}
