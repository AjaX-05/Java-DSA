package com.dsa_bootcamp_assignments.N_Strings;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }

        builder.deleteCharAt(0);
        builder.reverse();
        builder.deleteCharAt(0);
        System.out.println(builder);
    }
}
