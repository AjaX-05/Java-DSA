package com.dsa_bootcamp_assignments.Q_Backtracking;

import java.util.ArrayList;

public class b_MazeDiagonal {
    public static void main(String[] args) {
        System.out.println(maze("", 3, 3));
    }

    static ArrayList<String> maze(String p, int r, int c) {
        ArrayList<String> outer = new ArrayList<>();
        if (r == 1 && c == 1) {
            ArrayList<String> internal = new ArrayList<>();
            internal.add(p);
            return internal;
        }

        if (r > 1) {
            outer.addAll(maze(p + 'V', r - 1, c));
        }
        if (r > 1 && c > 1) {
            outer.addAll(maze(p + 'D', r - 1, c - 1));
        }
        if (c > 1) {
            outer.addAll(maze(p + 'H', r, c - 1));
        }

        return outer;
    }
}
