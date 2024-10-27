package com.dsa_bootcamp_assignments.P_Recursion.Medium;

public class e_KthSymbolGrammar {
    public static void main(String[] args) {
        int n = 4;
        int k = 6;

        int res = kThGrammar(n, k);
        System.out.println(res);
    }

    static int kThGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        if (k % 2 == 0) {
            if (kThGrammar(n - 1, k / 2) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (kThGrammar(n - 1, (k + 1) / 2) == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}