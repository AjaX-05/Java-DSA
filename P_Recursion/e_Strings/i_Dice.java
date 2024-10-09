package com.dsa_bootcamp_assignments.P_Recursion.e_Strings;

import java.util.ArrayList;

public class i_Dice {
    public static void main(String[] args) {
        int target = 7;
//        dice("", target);
//        System.out.println(diceRet("", target));
        System.out.println(diceFaceRet("", target, 8));

    }

    static void dice(String p, int up) {
        if (up == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= up; i++) {
            dice(p + i, up - i);
        }
    }

    static ArrayList<String> diceRet(String p, int up) {
        ArrayList<String> outer = new ArrayList<>();
        if (up == 0) {
            ArrayList<String> internal = new ArrayList<>();
            internal.add(p);
            return internal;
        }

        for (int i = 1; i <= 6 && i <= up; i++) {
            outer.addAll(diceRet(p + i, up - i));
        }
        return outer;
    }

    static void diceFace(String p, int up, int face) {
        if (up == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= up; i++) {
            diceFace(p + i, up - i, face);
        }
    }

    static ArrayList<String> diceFaceRet(String p, int up, int face) {
        ArrayList<String> outer = new ArrayList<>();
        if (up == 0) {
            ArrayList<String> internal = new ArrayList<>();
            internal.add(p);
            return internal;
        }

        for (int i = 1; i <= face && i <= up; i++) {
            outer.addAll(diceFaceRet(p + i, up - i, face));
        }
        return outer;
    }
}
