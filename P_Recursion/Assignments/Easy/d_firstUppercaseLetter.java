package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class d_firstUppercaseLetter {
    public static void main(String[] args) {
        String s = "geekS";
        firstUpper2("", s);
    }

    static void firstUpper(String up) {
        if (up.isEmpty()) {
            System.out.println("Not found!");
            return;
        }

        char ch = up.charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println(ch);
            return;
        }

        firstUpper(up.substring(1));
    }

    static void firstUpper2(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (Character.isUpperCase(ch)) {
            firstUpper2("" + ch, up.substring(1));
        } else {
            firstUpper2(p, up.substring(1));
        }
    }
}
