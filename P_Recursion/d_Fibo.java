package com.dsa_bootcamp_assignments.P_Recursion;

public class d_Fibo {
    public static void main(String[] args) {

        int ans = fibo(4);
        System.out.println(ans);
    }

    static int fibo(int n) {
//        Base Condition
        if (n < 2) {
            return n;
        }
//        Recursion (Recursive Relation)
        return fibo(n - 1) + fibo(n - 2);
//        The above is not a Tail Recursion
    }
}
