package com.dsa_bootcamp_assignments.P_Recursion.Easy;

public class e_sum_nTo1 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(sum(num));
    }

    static int sum(int num) {
//        Base case
        if (num == 1) {
            return 1;
        }

//        Recursive Relation
        return num + sum(num - 1);
    }
}
