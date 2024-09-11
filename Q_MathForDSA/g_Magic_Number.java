package com.dsa_bootcamp_assignments.Q_MathForDSA;

public class g_Magic_Number {
    public static void main(String[] args) {
        int n = 1;

        int ans = 0;
        int i = 1;
        while (n > 0) {
            if ((n & 1) == 0) {
                n = n >> 1;
            }else {
                ans += (int)Math.pow(5,i);
                n = n >> 1;
            }
            i++;
        }
        System.out.println(ans);
    }
}
