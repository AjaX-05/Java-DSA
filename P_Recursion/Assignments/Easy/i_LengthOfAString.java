package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class i_LengthOfAString {
    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        System.out.println(length(0, s));
    }

    static int length(int p, String up) {
        if (up.isEmpty()) {
            return p;
        }

        return length(p + 1, up.substring(1));
    }
}
