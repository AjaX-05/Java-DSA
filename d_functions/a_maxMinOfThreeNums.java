package com.dsa_bootcamp_assignments.d_functions;

import java.util.Arrays;
import java.util.Scanner;

public class a_maxMinOfThreeNums {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("Enter 3 nums: ");
        nums[0] = in.nextInt();
        nums[1] = in.nextInt();
        nums[2] = in.nextInt();

        System.out.println("Minimum no is " + min(nums));
        System.out.println("Maximum no is " + max(nums));

    }

    static int max(int[] nums) {
        if (nums[0] > nums[1] && nums[0] > nums[2]) {
            return nums[0];
        }
        if (nums[1] > nums[2] && nums[1] > nums[0]) {
            return nums[1];
        } else {
            return nums[2];
        }
    }
    static int min(int[] nums) {
        if (nums[0] < nums[1] && nums[0] < nums[2]) {
            return nums[0];
        }
        if (nums[1] < nums[2] && nums[1] < nums[0]) {
            return nums[1];
        } else {
            return nums[2];
        }
    }
}
