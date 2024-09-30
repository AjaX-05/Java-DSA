package com.dsa_bootcamp_assignments.P_Recursion.e_Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class e_subSetWithoutDuplicates_iteration {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2};
        System.out.println(subset2(arr));
    }

    static List<List<Integer>> subset2(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
//        System.out.println(outer);

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                Collections.sort(inner);
//                System.out.println(inner);

                if (!outer.contains(inner)){
                outer.add(inner);}
            }
        }

        return outer;
    }



    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<Integer>());

        int start = 0;
        int end = 0;
        for (int j = 0; j < arr.length; j++) {
            start = 0;
            if (j > 0 && arr[j] == arr[j - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int i = start; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }
        }

        return outer;
    }
}
