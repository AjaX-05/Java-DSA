package com.dsa_bootcamp_assignments.f_arrays_med_hard;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class f_FirstLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;

        System.out.println(Arrays.toString(binarySearh(nums,target)));
    }

    static int[] binarySearh(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        int[] res = new int[2];

        while (start <= end){
            int mid = start + ( end - start) / 2;
            if (target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                if (nums[start] == target && nums[end] == target){
                        res[0] = start;
                        res[1] = end;
                        return res;
                }
                if (nums[end] != target){
                    end = end -1;
                }
                if (nums[start] != target){
                    start = start + 1;
                }

            }
        }

        return new int[]{-1,-1};
    }

}
