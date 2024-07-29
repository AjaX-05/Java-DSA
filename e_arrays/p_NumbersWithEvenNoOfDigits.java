package com.dsa_bootcamp_assignments.e_arrays;

public class p_NumbersWithEvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {5555,901,482,1771};
        int counter = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {

            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                c++;
            }
            if (c % 2 == 0) {
                counter++;
            }
            c = 0;

        }
        System.out.println(counter);
    }
}
