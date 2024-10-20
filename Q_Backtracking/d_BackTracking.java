package com.dsa_bootcamp_assignments.Q_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class d_BackTracking {
    //    Maze Problem with all directions allowed (R,D,U,L)
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int r = 0;
        int c = 0;

        int[][] p = new int[board.length][board[0].length];
        int step = 1;
        maze("", r, c, board);
    }

    static void mazePaths(String path, int[][] p, int r, int c, boolean[][] maze, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            p[r][c] = step;
            for (int i = 0; i < p.length; i++) {
                System.out.println(Arrays.toString(p[i]));
            }
            System.out.println(path);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            p[r][c] = step;
            mazePaths(path + "D", p, r + 1, c, maze, step + 1);
        }

        if (c < maze[0].length - 1) {
            p[r][c] = step;
            mazePaths(path + "R", p, r, c + 1, maze, step + 1);
        }

        if (r > 0) {
            p[r][c] = step;
            mazePaths(path + "U", p, r - 1, c, maze, step + 1);
        }

        if (c > 0) {
            p[r][c] = step;
            mazePaths(path + "L", p, r, c - 1, maze, step + 1);
        }

//        Backtracking
//        reverting back the false
        maze[r][c] = true;
        p[r][c] = 0;
    }


    static void maze(String p, int r, int c, boolean[][] maze) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            maze(p + 'D', r + 1, c, maze);
        }

        if (c < maze[0].length - 1) {
            maze(p + 'R', r, c + 1, maze);
        }

        if (r > 0) {
            maze(p + 'U', r - 1, c, maze);
        }

        if (c > 0) {
            maze(p + 'L', r, c - 1, maze);
        }

//        Backtracking
//        reverting back the false
        maze[r][c] = true;
    }
}
