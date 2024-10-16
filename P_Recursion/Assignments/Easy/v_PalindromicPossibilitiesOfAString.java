package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

import java.util.ArrayList;

public class v_PalindromicPossibilitiesOfAString {
    public static void main(String[] args) {
        String str = "nitin";
        check("", str, 0, str.length() - 1, 0, new ArrayList<>());
    }

    static boolean isPalindrome(String str, int s, int e) {
        if (s > e) {
            return true;
        }

        if (str.charAt(s) == str.charAt(e)) {
            return isPalindrome(str, ++s, --e);
        } else {
            return false;
        }
    }

    static void check(String p, String up, int m, int n, int j, ArrayList<String> list) {
        if (j == up.length()) {
            System.out.println(list);
            return;
        }

        if (m + j + 1 <= up.length()) {
            p = up.substring(m, m + j + 1);
        }
        if (!p.isEmpty() && isPalindrome(p, 0, p.length() - 1)) {
            list.add(p);
        }
        if (m + j == up.length() - 1) {
            check("", up, 0, ++n, ++j, list);
        } else {
            check("", up, ++m, n, j, list);
        }
    }
}