package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class o_SumOfnNaturalNums {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(sum_rec(0, num));
    }

    static int sum_rec(int p, int up) {
        if (up == 0) {
            return p;
        }
        return sum_rec(p + up, --up);
    }
}
