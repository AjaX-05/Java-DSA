package com.dsa_bootcamp_assignments.Q_MathForDSA;

public class i_SumRowValueInPascalsTriangle {
    public static void main(String[] args) {
        int row_no = 10;
        int res = 1 << (row_no - 1);
        System.out.println(res);
    }
}
