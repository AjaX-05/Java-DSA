package com.dsa_bootcamp_assignments.N_Strings_Problems;

import java.util.Arrays;

public class k_robotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "UDUU";

        int[] origin = {0, 0};

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                origin[0]++;
            } else if (moves.charAt(i) == 'D') {
                origin[0]--;
            } else if (moves.charAt(i) == 'L') {
                origin[1]++;
            } else if (moves.charAt(i) == 'R') {
                origin[1]--;
            }
        }

        System.out.println(Arrays.toString(origin));


    }


}
