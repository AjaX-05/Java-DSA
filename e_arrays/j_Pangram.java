package com.dsa_bootcamp_assignments.e_arrays;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/


public class j_Pangram {

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String abc = "abcdefghijklmnopqrstuvwxyz";

        boolean tOrf = false;
        for (int i = 0; i < abc.length(); i++) {
            if (sentence.contains(Character.toString(abc.charAt(i)))) {
                tOrf = true;
            } else {
                tOrf = false;
                break;
            }
        }
        System.out.println(tOrf);

    }
}
