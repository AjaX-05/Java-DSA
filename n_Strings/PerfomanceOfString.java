package com.dsa_bootcamp_assignments.n_Strings;

public class PerfomanceOfString {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }

        System.out.println(series);
    }
}
