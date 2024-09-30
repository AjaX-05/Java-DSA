package com.dsa_bootcamp_assignments.P_Recursion.e_Strings;

import java.util.ArrayList;
import java.util.List;

public class d_subSet_Iteration {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
//        List<List<Integer>> res = subset(arr);
//        System.out.println(res);
//        for (List<Integer> li : res){
//            System.out.println(li);
//        }

        System.out.println(subset(arr));
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
//        System.out.println(outer);

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {

                List<Integer> inner = new ArrayList<>(outer.get(i));
//                System.out.println(inner);
                inner.add(num);
//                System.out.println(inner);
                if (!outer.contains(inner)) {
                    outer.add(inner);
                }
            }
        }

        return outer;
    }


}
