package com.dsa_bootcamp_assignments.N_Strings_Problems;

public class q_validPalindromeII {
    public static void main(String[] args) {
        String s = "aba";

        if (!func(s)) {
            System.out.println(func2(s));
        }
        else {
            System.out.println(true);
        }
    }

    static boolean func(String s) {
        int limit = 0;
        int j = s.length() - 1;
        int i = 0;

        while (j > i) {
            if (s.charAt(i) == s.charAt(j)) {
                j--;
                i++;
            } else if (s.charAt(i) != s.charAt(j)) {
                limit++;
                i++;
            }
        }
        if (limit > 1) {
            return false;
        } else {
            return true;
        }
    }

    static boolean func2(String s) {
        int limit = 0;
        int j = s.length() - 1;
        int i = 0;

        while (j > i) {
            if (s.charAt(i) == s.charAt(j)) {
                j--;
                i++;
            } else if (s.charAt(i) != s.charAt(j)) {
                limit++;
                j--;
            }
        }
        if (limit > 1) {
            return false;
        } else {
            return true;
        }
    }


}
