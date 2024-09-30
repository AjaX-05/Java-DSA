package com.dsa_bootcamp_assignments.N_Strings_Problems;

public class k_ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "seadbutsad";
        String needle = "sad";

        int res = strStr(haystack, needle, 0);
        System.out.println(res);
    }

    static int strStr(String up, String p, int n) {
        if (up.isEmpty()) {
//            System.out.println(-1);
            return -1;
        }

        if (up.startsWith(p)) {
//            System.out.println(n);
            return n;
        }

        return strStr(up.substring(1), p, n + 1);

    }
}
