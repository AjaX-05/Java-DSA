package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class w_PowerSetInLexicographicOrder {
    public static void main(String[] args) {
        String s = "abc";
        func("", s);
    }

    static void func(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        func(p + ch, up.substring(1));
        func(p, up.substring(1));

    }
}
