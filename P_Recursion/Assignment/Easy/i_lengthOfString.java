package com.dsa_bootcamp_assignments.P_Recursion.Assignment.Easy;

public class i_lengthOfString {
    public static void main(String[] args) {
        String word = "GEEKSFORGEEKS";
        System.out.println(length(word));

//        System.out.println((word.substring(13)));
    }

    static int length(String word) {
        if (word.equals("")) {
            return 0;
        }
        return length(word.substring(1)) + 1;
    }
}