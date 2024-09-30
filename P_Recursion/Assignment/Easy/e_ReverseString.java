package com.dsa_bootcamp_assignments.P_Recursion.Assignment.Easy;

import java.util.Arrays;

public class e_ReverseString {
    public static void main(String[] args) {
        char[] str = {'H', 'a', 'n', 'n', 'a', 'h'};
        int s = 0;
        int e = str.length - 1;
        reverse(str,s,e);
        System.out.println(Arrays.toString(str));
//        int j = str.length - 1;
//        for (int i = 0; i < str.length; i++) {
//            if (i > j) {
//                break;
//            }
//            char temp = str[i];
//            str[i] = str[j];
//            str[j] = temp;
//            j--;
//        }
//        System.out.println(Arrays.toString(str));
    }

    static void reverse(char[] str, int s, int e) {
//        Base
        if (s > e) {
            return;
        }
//        Swap
        char temp = str[s];
        str[s] = str[e];
        str[e] = temp;


//    Recursive Relation
        reverse(str, s + 1, e - 1);
    }
}
