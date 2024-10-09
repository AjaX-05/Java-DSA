package com.dsa_bootcamp_assignments.LC150;

public class IsSubsequence {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ahbgdc";

        int i = 0;
        int j = 0;

        while (j <= s2.length()) {
            if (i >= s1.length()) {
                System.out.println(true);
                break;
            }
            if (s2.charAt(j) == s1.charAt(i)) {
                i++;
            }

            j++;
        }
    }
}
