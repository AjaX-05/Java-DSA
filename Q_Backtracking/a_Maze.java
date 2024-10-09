package com.dsa_bootcamp_assignments.Q_Backtracking;

import java.util.ArrayList;

public class a_Maze {
    public static void main(String[] args) {
//        System.out.println(maze(2, 2));
//        mazePath("", 3, 3);
        System.out.println(mazePathRet("", 3, 3));
    }


    static int maze(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int right = maze(r, c - 1);
        int down = maze(r - 1, c);

        return right + down;
    }

    static void mazePath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            mazePath(p + 'D', r - 1, c);
        }
        if (c > 1) {
            mazePath(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> mazePathRet(String p, int r, int c) {
        ArrayList<String> outer = new ArrayList<>();
        if (r == 1 && c == 1) {
            ArrayList<String> internal = new ArrayList<>();
            internal.add(p);
            return internal;
        }

        if (r > 1) {
            outer.addAll(mazePathRet(p + 'D', r - 1, c));
        }
        if (c > 1) {
            outer.addAll(mazePathRet(p + 'R', r, c - 1));
        }


        return outer;
    }

    static void mazePath2(int r, int c, String p) {
        if (r == 1) {
            while (c > 1) {
                p += 'R';
                c--;
            }
            while (r > 1) {
                p += 'D';
                r--;
            }
            System.out.println(p);
            return;
        }
        if (c == 1) {
            while (c > 1) {
                p += 'R';
                c--;
            }
            while (r > 1) {
                p += 'D';
                r--;
            }
            System.out.println(p);
            return;
        }

        mazePath2(r - 1, c, p + 'D');
        mazePath2(r, c - 1, p + 'R');

    }
}
