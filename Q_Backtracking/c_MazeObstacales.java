package com.dsa_bootcamp_assignments.Q_Backtracking;

import java.util.ArrayList;

public class c_MazeObstacales {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

//        pathRestriction("", maze, 0, 0);
        System.out.println(pathRestrictionRet("", maze, 0, 0));
    }

    static void pathRestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestriction(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestriction(p + 'R', maze, r, c + 1);
        }
    }

    static ArrayList<String> pathRestrictionRet(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (!maze[r][c]) {
            return list;
        }

        if (r < maze.length - 1) {
            list.addAll(pathRestrictionRet(p + 'D', maze, r + 1, c));
        }

        if (c < maze[0].length - 1) {
            list.addAll(pathRestrictionRet(p + 'R', maze, r, c + 1));
        }

        return list;
    }
}
