package com.dsa_bootcamp_assignments.h_searching;

import java.util.ArrayList;
import java.util.Arrays;

public class l_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        ArrayList<Integer> newList = new ArrayList<>();


        for (int num : nums1) {
            for (int num2 : nums2) {
                if (num2 == num && !newList.contains(num)) {
                    newList.add(num2);

                }
                break;
            }
        }
        int totalSize = newList.size();
        int[] finalAns = new int[totalSize];

        for (int i = 0; i < totalSize; i++) {
            finalAns[i] = newList.get(i);
        }
        System.out.println(Arrays.toString(finalAns));


    }
}
