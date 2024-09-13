package com.dsa_bootcamp_assignments.N_Strings_Problems;

public class validPalindrome {
    public static void main(String[] args) {
        String s = "1a2";
        String res = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(res);
        boolean tOrF = isPalindrome(res);
        System.out.println(tOrF);
    }

    static boolean isPalindrome(String res) {
        int i = 0;
        int j = res.length()-1;
        while (i < j) {
            if (res.charAt(i) == res.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
