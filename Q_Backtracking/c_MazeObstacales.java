package com.dsa_bootcamp_assignments.Q_Backtracking;

import java.util.ArrayList;

public class c_MazeObstacales {
    public static void main(String[] args) {
//        System.out.println(maze("", 0, 0));

        boolean[][] board = {
                {true, true, true},
                {true, false, false},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(maze2("", board, 0, 0));

    }

    static ArrayList<String> maze2(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> internal = new ArrayList<>();
            internal.add(p);
            return internal;
        }

        if (!maze[r][c]) {
            return new ArrayList<>();
        }

        ArrayList<String> outer = new ArrayList<>();

        if (r < maze.length - 1) {
            outer.addAll(maze2(p + 'V', maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            outer.addAll(maze2(p + 'H', maze, r, c + 1));
        }

        return outer;
    }

    static ArrayList<String> maze(String p, int r, int c) {
        ArrayList<String> outer = new ArrayList<>();
        if (r == 1 && c == 1) {
            ArrayList<String> internal = new ArrayList<>();
            return internal;
        }
        if (r == 2 && c == 2) {
            ArrayList<String> internal = new ArrayList<>();
            internal.add(p);
            return internal;
        }

        if (r < 3) {
            outer.addAll(maze(p + 'V', r + 1, c));
        }
        if (c < 3) {
            outer.addAll(maze(p + 'H', r, c + 1));
        }
        return outer;
    }
}
