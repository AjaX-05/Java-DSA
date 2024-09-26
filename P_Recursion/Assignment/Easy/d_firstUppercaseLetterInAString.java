package com.dsa_bootcamp_assignments.P_Recursion.Assignment.Easy;

public class d_firstUppercaseLetterInAString {
    public static void main(String[] args) {
        String word = "gMeeksforgeeKs";
        int n = word.length();
//        char ch;
//        for (int i = 0; i < word.length(); i++) {
//            if (Character.isUpperCase(word.charAt(i))) {
//                System.out.println(word.charAt(i));
//            }
//        }
        System.out.println(find(word, n - 1, '-'));
    }

    static char find(String word, int n, char ch) {
        if (n == 0) {
            return ch;
        }
        if (Character.isUpperCase(word.charAt(n))) {
            ch = word.charAt(n);
        }
        return find(word, n - 1, ch);
    }
}
