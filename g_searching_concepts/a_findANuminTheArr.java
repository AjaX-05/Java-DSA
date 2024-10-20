package com.dsa_bootcamp_assignments.g_searching_concepts;

import java.util.Scanner;

public class a_findANuminTheArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = in.nextInt();

        int search_index = search(nums,target);
        System.out.println(search_index);
    }

//    Return the Integer if item found
//    Otherwise return -1

    static int search(int[] nums, int target){
        if (nums.length == 0){
            return -1;
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target){
                return index;
            }
        }

        return -1;
    }
}
