package com.dsa_bootcamp_assignments.LC150;

import java.util.Arrays;

public class e_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,3,4};

        quickSort(nums, 0, nums.length - 1);

        int highest = 0;
        int count = 1;
        for (int i = 0; i <= nums.length; i++) {
            if (i == nums.length) {
                if (count > highest) {
                    highest = i - 1;
                }
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                count++;
            } else if (i > 0 && nums[i] > nums[i - 1]) {
                if (count > highest) {
                    highest = i - 1;
                }
                count = 1;
            }
        }


        System.out.println(Arrays.toString(nums));
        System.out.println(highest);
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
