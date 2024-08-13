package com.dsa_bootcamp_assignments.i_searching_medium;

public class b_SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(search(nums));
    }

    static int search(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (start == end) {
            return nums[start];
        } else if (start + 2 <= end && nums[0] != nums[start + 1] && nums[start + 1] == nums[start + 2]) {
            return nums[0];
        }else if (end - 2 >= 0 && nums[end] != nums[end - 1] && nums[end - 1] == nums[end - 2]) {
            return nums[end];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }
            if ((start + 2 <= end) && (nums[start] == nums[start + 1]) || (nums[start] != nums[start + 1] && nums[start + 1] == nums[start + 2])) {
                start++;
            }else{
                end--;
            }
//
//            if ((end - 2 >= start) && (nums[end] == nums[end - 1]) || (nums[end] != nums[end - 1] && nums[end - 1] == nums[end - 2])) {
//                end--;
//            }


        }
        return nums[start];
    }
}
