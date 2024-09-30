package com.dsa_bootcamp_assignments.N_Strings_Problems;

public class f_checkIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }

        System.out.println(sb1.toString().equals(sb2.toString()));
    }
}
