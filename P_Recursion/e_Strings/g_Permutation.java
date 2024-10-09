package com.dsa_bootcamp_assignments.P_Recursion.e_Strings;

import java.util.ArrayList;

public class g_Permutation {
    public static void main(String[] args) {
        System.out.println(permCount("", "123"));
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            permutation(first + ch + second, up.substring(1));
        }


    }

    static ArrayList<String> permutationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            ans.addAll(permutationList(first + ch + second, up.substring(1)));
        }

        return ans;
    }


    static int permCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i < up.length(); i++) {
            String f = up.substring(0, i);
            String s = up.substring(i, up.length());

            count = count + permCount(f + ch + p, up.substring(1));
        }

        return count;
    }
}
