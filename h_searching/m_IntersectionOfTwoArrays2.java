package com.dsa_bootcamp_assignments.h_searching;

import java.util.ArrayList;
import java.util.Arrays;

public class m_IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5, 6, 9, 9, 9};
        int[] nums2 = {9, 4, 9, 8, 6, 4};
        bubbleSort(nums1);
        bubbleSort(nums2);
        System.out.println(Arrays.toString((nums1)));
        System.out.println(Arrays.toString((nums2)));

        int[] res = bS(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }

    static int[] bS(int[] n1, int[] n2) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        boolean detected;
        int temp = 0;
        for (int i = 0; i < n1.length; i++) {
            detected = false;
            for (int j = 0 + temp; j < n2.length; j++) {
                if (n1[i] == n2[j]) {
                    System.out.println(n1[i]);
                    myList.add(n1[i]);
                    detected = true;
                    temp = j;
                    break;
                }
            }
            if (detected) {
                temp++;
            }
        }
        int[] arr = new int[myList.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = myList.get(i);
        }
        return arr;
    }


    static void bubbleSort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }


}
