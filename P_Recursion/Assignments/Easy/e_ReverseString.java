package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

import java.util.Arrays;

public class e_ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverse(s, 0, s.length - 1);
        System.out.println(Arrays.toString(s));
    }

    static void reverse(char[] s, int start, int end) {
        if (start > end) {
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverse(s, start + 1, end - 1);
    }
}