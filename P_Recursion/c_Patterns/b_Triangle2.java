package com.dsa_bootcamp_assignments.P_Recursion.c_Patterns;

public class b_Triangle2 {
    public static void main(String[] args) {
        int row = 4;
        int col = 0;
        triangle(row, col);
    }

    static void triangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            triangle(row, col + 1);
            System.out.print("*");
        } else {
            triangle(row - 1, 0);
            System.out.println();
        }
    }
}
