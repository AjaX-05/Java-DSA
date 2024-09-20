package com.dsa_bootcamp_assignments.P_Recursion.c_Patterns;

public class a_Triangle1 {
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
            System.out.print("* ");
            triangle(row, col + 1);
        } else {
            System.out.println();
            triangle(row - 1, 0);
        }
    }
}
