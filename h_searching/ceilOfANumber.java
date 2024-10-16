package com.dsa_bootcamp_assignments.h_searching;

public class ceilOfANumber {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 9, 14, 16, 18};
        int target = 19;

        System.out.println(ceil(nums, target));
    }

    static int ceil(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        if (target > nums[end-1]){
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
            else{
                return nums[mid];
            }
        }
        return nums[start];
    }
}
