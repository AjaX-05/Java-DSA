package com.dsa_bootcamp_assignments.N_Strings_Problems;

import java.util.Arrays;

public class h_DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {

        String s = "boeook";

        String s1 = s.substring(0, s.length() / 2).toLowerCase();
        String s2 = s.substring(s.length() / 2).toLowerCase();

        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i'|| s1.charAt(i) == 'o'|| s1.charAt(i) == 'u' ){
                c1++;
            }
            if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i'|| s2.charAt(i) == 'o'|| s2.charAt(i) == 'u'){
                c2++;
            }
        }

        if (c1==c2){
            System.out.println(true);
        }
    }
}
