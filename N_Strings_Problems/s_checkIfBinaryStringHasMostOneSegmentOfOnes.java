package com.dsa_bootcamp_assignments.N_Strings_Problems;

public class s_checkIfBinaryStringHasMostOneSegmentOfOnes {
    public static void main(String[] args) {
        String s = "1100111";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (i - 1 > 0 && s.charAt(i - 1) == '0') {
                    count = 0;
                    break;
                }
                else {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
