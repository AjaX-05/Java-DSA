package com.dsa_bootcamp_assignments.h_searching;

import java.util.ArrayList;
import java.util.Arrays;

public class m_IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        System.out.println(Arrays.toString((nums1)));
        System.out.println(Arrays.toString((nums2)));

        int[] res = tP(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }

    static int[] tP(int[] n1, int[] n2) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < n1.length && j < n2.length) {
            if (n1[i] == n2[j]) {
                myList.add(n1[i]);
                i++;
                j++;
            } else if (n1[i] > n2[j]) {
                j++;
            } else {
                i++;
            }
        }

        int[] arr = new int[myList.size()];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = myList.get(k);
        }
        return arr;

//        return new int[]{-1, -1};
    }


}
