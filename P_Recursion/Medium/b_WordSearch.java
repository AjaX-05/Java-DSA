package com.dsa_bootcamp_assignments.P_Recursion.Medium;

import java.util.ArrayList;

public class b_WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'C', 'A', 'A'},
                {'A', 'A', 'A'},
                {'B', 'C', 'D'}
        };

        String s = "AAB";
        char first = s.charAt(0);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == first) {
                    list.addAll(search(s.charAt(0) + "", i, j, board, s, 1));
                }
            }
        }

        if (list.contains(s)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static ArrayList<String> search(String p, int r, int c, char[][] maze, String s, int i) {
        if (i == s.length()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (maze[r][c] == '0') {
            return list;
        }

//        Track
        char temp = maze[r][c];
        maze[r][c] = '0';

        char ch = s.charAt(i);
        if (r < maze.length - 1) {
            if (maze[r + 1][c] == ch) {
                list.addAll(search(p + ch, r + 1, c, maze, s, i + 1));
            }
        }

        if (c < maze[0].length - 1) {
            if (maze[r][c + 1] == ch) {
                list.addAll(search(p + ch, r, c + 1, maze, s, i + 1));
            }
        }

        if (r > 0) {
            if (maze[r - 1][c] == ch) {
                list.addAll(search(p + ch, r - 1, c, maze, s, i + 1));
            }
        }

        if (c > 0) {
            if (maze[r][c - 1] == ch) {
                list.addAll(search(p + ch, r, c - 1, maze, s, i + 1));
            }
        }

//      Back Track
        maze[r][c] = temp;

        return list;
    }


}