package com.dsa_bootcamp_assignments.P_Recursion.e_Strings;

import java.util.ArrayList;

public class b_subsequence {

    public static void main(String[] args) {
//        subseq("", "abc");
//        ArrayList<String> res = new ArrayList<>();
        System.out.println((subseqRet("", "abc")));
//        System.out.println(res);

    }

    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
//        System.out.println(left);
        ArrayList<String> right = subseqRet(p, up.substring(1));
//        System.out.println(right);

        left.addAll(right);
        return left;
    }

    static void subseqArr(String p, String up, ArrayList<String> res) {
        if (up.isEmpty()) {
            res.add(p);
            return;
        }

        char ch = up.charAt(0);

        subseqArr(p + ch, up.substring(1), res);
        subseqArr(p, up.substring(1), res);
    }


    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
}
