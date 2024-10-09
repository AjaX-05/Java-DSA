package com.dsa_bootcamp_assignments.P_Recursion.e_Strings;

import java.util.ArrayList;

public class h_LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        String s = "";
//        int i = s.charAt(0) - '0';
//        System.out.println("" + (i + 'a' - 1));
//        System.out.println((char) (1 + 'a'));
        System.out.println(padLC("", s));
        System.out.println((char)(1+'a'));
    }

    static ArrayList<String> padLC(String p, String up) {
        ArrayList<String> outer = new ArrayList<>();

        if (up.isEmpty()) {
            ArrayList<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }
        int digit = up.charAt(0) - '0';

        int x = 0;
        int y = 0;
        if (digit > 1 && digit < 7) {
            x = (digit - 2) * 3;
            y = (digit - 1) * 3;
        }
        if (digit == 7) {
            x = 15;
            y = 19;
        } else if (digit == 8) {
            x = 19;
            y = 22;
        } else if (digit == 9) {
            x = 22;
            y = 26;
        }

        for (int i = x; i < y; i++) {
            char ch = (char) ('a' + i);
            outer.addAll(padLC(p + ch, up.substring(1)));
        }

        return outer;
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padRet(String p, String up) {
        ArrayList<String> outer = new ArrayList<>();

        if (up.isEmpty()) {
            ArrayList<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            outer.addAll(padRet(p + ch, up.substring(1)));
        }

        return outer;
    }

    static int padCount(String p, String up) {
        int count = 0;
        if (up.isEmpty()) {
            return 1;
        }

        int num = up.charAt(0) - '0';

        for (int i = (num - 1) * 3; i < num * 3; i++) {
            char ch = (char) (num + i);
            count += padCount(p + ch, up.substring(1));
        }
        return count;
    }


}
