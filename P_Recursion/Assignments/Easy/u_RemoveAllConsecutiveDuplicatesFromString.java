package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class u_RemoveAllConsecutiveDuplicatesFromString {
    public static void main(String[] args) {
        String s = "aabccba";
        dups("", s);
    }

    static void dups(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (p.isEmpty()) {
            dups(p + ch, up.substring(1));
        } else if (ch != p.charAt(p.length() - 1)) {
            dups(p + ch, up.substring(1));
        } else {
            dups(p, up.substring(1));
        }
    }
}
