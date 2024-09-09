package com.dsa_bootcamp_assignments.Q_MathForDSA;

public class d_setTheiThBit {
    public static void main(String[] args) {
        int num = 86;
        int i = 4;
        int res = (ans(num, i));
        System.out.println((res));
  }

    static int ans(int num, int i) {
        return 1 << (i - 1) | num;
         }
}
