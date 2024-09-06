package com.dsa_bootcamp_assignments.i_searching_medium;

public class e_FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int res = bS(nums);
        System.out.println(res);
    }

    static int bS(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid + 1 <= nums.length - 1 && nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return nums[start];
    }
}
