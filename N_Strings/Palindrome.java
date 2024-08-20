package com.dsa_bootcamp_assignments.N_Strings;

public class Palindrome {

    public static void main(String[] args) {
        String s = "".toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        System.out.println(function(s, start, end));
    }

    static boolean function(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}