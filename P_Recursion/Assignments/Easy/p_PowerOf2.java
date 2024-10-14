package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class p_PowerOf2 {
    public static void main(String[] args) {
        int num = 3;
        powOf2((double)(num));
    }

    static boolean powOf2(double num) {
        if (num < 1.0) {
            return false;
        }
        if (num == 1.0) {
            return true;
        }

        return powOf2((double) (num / 2f));
    }
}
