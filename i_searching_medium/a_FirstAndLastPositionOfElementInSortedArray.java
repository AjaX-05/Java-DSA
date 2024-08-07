package com.dsa_bootcamp_assignments.i_searching_medium;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.lang.reflect.Array;
import java.util.Arrays;

public class a_FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(findPosition(nums, target)));
    }

    static int[] findPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int[] res = {-1, -1};

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }

            if (target == nums[mid]) {
                while (nums[start] != nums[mid]) {
                    start++;
                }
                while (nums[end] != nums[mid]) {
                    end--;
                }
                res[0] = start;
                res[1] = end;

                return res;
            }
        }
        return res;
    }
}
