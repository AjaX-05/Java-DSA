package com.dsa_bootcamp_assignments.P_Recursion.e_Strings;

import java.util.ArrayList;

public class c_printAsciiValueOfAChar {
    public static void main(String[] args) {

//        Ascii value of a char
//        char ch = 'a';
//        System.out.println((int) (ch));
//        or
//        System.out.println(ch + 0);

//        subseqAscii("", "ab");

        System.out.println(subseqAsciiArr("", "ab"));
    }

    //    Returns in an Arr of String
    static ArrayList<String> subseqAsciiArr(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqAsciiArr(ch + p, up.substring(1));
        ArrayList<String> mid = subseqAsciiArr((ch + 0) + p, up.substring(1));
        ArrayList<String> right = subseqAsciiArr(p, up.substring(1));

        left.addAll(mid);
        left.addAll((right));

        return left;

    }

    //    Prints
    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch + 0), up.substring(1));
    }


}
