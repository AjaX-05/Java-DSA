package com.dsa_bootcamp_assignments.P_Recursion.d_sorting;

import java.util.Arrays;

public class d_MergeSort {
    public static void main(String[] args) {
        int[] nums = {55,2,3,1,6};
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static int[] mergeSort(int[] nums) {

        if (nums.length == 1) {
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;

        int mix[] = new int[first.length + second.length];
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

}
