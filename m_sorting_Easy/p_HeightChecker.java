package com.dsa_bootcamp_assignments.m_sorting_Easy;

import java.util.Arrays;

public class p_HeightChecker {
    public static void main(String[] args) {
        int[] heights = {5,1,2,3,4};
        int[] temp = Arrays.copyOf(heights, heights.length);
        quickSort(heights,0,heights.length-1);
//        System.out.print(Arrays.toString(heights));
        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != temp[i]) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    static void quickSort(int[] nums, int low , int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;

        int mid = s + (e-s) / 2;
        int pivot = nums[mid];

        while(s <= e){
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(nums,low,e);
        quickSort(nums,s,high);
    }

//    static void BBsort(int[] nums) {
//        boolean swapped;
//        for (int i = 0; i < nums.length; i++) {
//            swapped = false;
//            for (int j = 1; j < nums.length - i; j++) {
//                if (nums[j - 1] > nums[j]) {
//                    int temp = nums[j - 1];
//                    nums[j - 1] = nums[j];
//                    nums[j] = temp;
//                    swapped = true;
//                }
//            }
//            if (!swapped) {
//                break;
//            }
//        }
//    }
}
