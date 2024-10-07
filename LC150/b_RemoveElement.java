package com.dsa_bootcamp_assignments.LC150;

import java.util.Arrays;

public class b_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
//        Expected output k = 5, nums{0,1,3,0,4,_,_,_}
//        Sorted gives {0,0,1,2,2,2,3,4}

        quickSort(nums, 0, nums.length - 1);

        int res = removeElement(nums, val);
        System.out.println(Arrays.toString(nums));
        System.out.println(res);
    }

    static int removeElement(int[] nums, int val) {
        int k = 0;

        int i = 0;
        int j = nums.length - 1;

        while (i < nums.length) {
            if (nums[i] == val) {
                int temp = Integer.MAX_VALUE;
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
                k++;
            } else {
                i++;
            }
        }
        return nums.length - k;
    }

    static void quickSort(int[] nums, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int s = lo;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(nums, lo, e);
        quickSort(nums, s, hi);

    }


}
