package com.dsa_bootcamp_assignments.N_Strings_Problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class b_ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";

        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        StringBuilder res = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            res.setCharAt(indices[i], s.charAt(i));
        }
        System.out.println(res.toString());
    }
}
