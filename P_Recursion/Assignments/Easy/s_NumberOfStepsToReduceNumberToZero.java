package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class s_NumberOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        int num = 8;

        System.out.println(reduce(0, num));

    }

    static int reduce(int p, double up) {
        if (up == 0) {
            return p;
        }

        if (up % 2 == 0) {
            return reduce(p + 1, up / 2);
        } else {
            return reduce(p + 1, up - 1);
        }
    }

}
