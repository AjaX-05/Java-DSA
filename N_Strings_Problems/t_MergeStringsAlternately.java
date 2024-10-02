package com.dsa_bootcamp_assignments.N_Strings_Problems;

public class t_MergeStringsAlternately {
    public static void main(String[] args) {
        String w1 = "ab";
        String w2 = "pqrs";

        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < w1.length() && j < w2.length()) {
            sb.append(w1.charAt(i));
            sb.append(w2.charAt(j));
            i++;
            j++;
        }

        while (i < w1.length()) {
            sb.append(w1.charAt(i));
            i++;
        }
        while (j < w2.length()) {
            sb.append(w2.charAt(j));
            j++;
        }

        System.out.println(sb.toString());
    }
}
