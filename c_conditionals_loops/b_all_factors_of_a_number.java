package com.dsa_bootcamp_assignments.c_conditionals_loops;
//https://leetcode.com/problems/number-of-common-factors/
import java.util.ArrayList;

public class b_all_factors_of_a_number {
    public static void main(String[] args) {
//        System.out.println(8%8);
        ArrayList<Integer> ans = factorsOfNumber(25);
        ArrayList<Integer> ans2 = factorsOfNumber(30);
//        System.out.println(ans);
//        System.out.println(ans2);
        int counter = 0;

        for (int element: ans){
            if (ans2.contains(element)){
                counter++;
            }
        }
        System.out.println(counter);

    }

    static ArrayList<Integer> factorsOfNumber(int n){
        int nCounter = n;
        ArrayList<Integer> res = new ArrayList<>();
        while (nCounter > 0){
            if (n % nCounter == 0){
                res.add(nCounter);
            }
            nCounter--;
        }
        return res;
    }
}
