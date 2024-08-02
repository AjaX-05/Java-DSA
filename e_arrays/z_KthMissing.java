package com.dsa_bootcamp_assignments.e_arrays;

import java.awt.*;
import java.util.ArrayList;

public class z_KthMissing {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int k = 2;

        ArrayList<Integer> totalArr = totalNums(arr, k);
        ArrayList<Integer> filtered = missingElements(arr, totalArr);

//        System.out.println(KthElement(filtered, k));
        System.out.println(filtered.get(k - 1));
    }

//    static int KthElement(ArrayList<Integer> filtered, int k) {
//        return filtered.get(k-1);
//    }

    static ArrayList<Integer> missingElements(int[] arr, ArrayList<Integer> totalArr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < totalArr.size(); j++) {
                if (totalArr.get(j).equals(arr[i])) {
//                    System.out.println(totalArr.get(j));
                    totalArr.remove(j);
                }

            }
        }

//        System.out.println(totalArr);
        return totalArr;
    }

    static ArrayList<Integer> totalNums(int[] nums, int k) {
        int start = 1;
        int end = nums[nums.length - 1] + k;

        ArrayList<Integer> myTotalList = new ArrayList<>(end);
        for (int i = 0; i < end; i++) {
            myTotalList.add(i, start);
            start++;
        }
//        System.out.println(myTotalList);
        return myTotalList;
    }

}
