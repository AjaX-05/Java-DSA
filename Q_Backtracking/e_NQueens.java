package com.dsa_bootcamp_assignments.Q_Backtracking;

public class e_NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nQueens(board, 0);
    }

    static void nQueens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
        }


        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {
                board[row][col] = true;
                nQueens(board, row + 1);
                board[row][col] = false;
            }

        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        int leftMax = Math.min(row, col);
        for (int i = 1; i <= leftMax; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        int rightMax = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= rightMax; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
