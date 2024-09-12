package com.dsa_bootcamp_assignments.h_searching;

public class f_ArrangingCoins {
    public static void main(String[] args) {
        int n = 8;
        int row = 0;

        for (int i = 1; i <= n; i = i + 1) {
            if(n-i >=0){
                n = n-i;
                row++;
            }
        }
        System.out.println(row);
    }
}
