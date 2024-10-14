package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class q_FactorialOfNum {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(fact(num));
    }

    static int fact(int num) {
        if (num == 1) {
            return 1;
        }

        return (num) * fact(--num);

    }
}
