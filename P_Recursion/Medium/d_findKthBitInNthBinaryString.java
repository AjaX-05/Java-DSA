package com.dsa_bootcamp_assignments.P_Recursion.Medium;

import java.util.Arrays;

public class d_findKthBitInNthBinaryString {
    public static void main(String[] args) {
        int n = 4;
        int k = 1;

        String res = find("0", n);
        System.out.println(res.charAt(k - 1));
    }

    static String find(String p, int n) {
        if (n == 1) {
            return p;
        }
//Invert
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            if (ch == '0') {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
//        Reverse
        char[] chArr = sb.toString().toCharArray();
        int start = 0;
        int end = sb.length() - 1;

        while (start < end) {
            char temp = chArr[start];
            chArr[start] = chArr[end];
            chArr[end] = temp;
            start++;
            end--;
        }
        String s2 = new String(chArr);

        return find(p + 1 + s2, n - 1);
    }
}