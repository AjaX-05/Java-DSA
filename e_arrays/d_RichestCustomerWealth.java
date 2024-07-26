package com.dsa_bootcamp_assignments.e_arrays;
//https://leetcode.com/problems/richest-customer-wealth
import java.util.Arrays;

public class d_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] customers = {
                {1,2,3},
                {4,5,1}
        };
        System.out.println(richestCustomer((customers)));
    }

    static int richestCustomer(int[][] customers){
        int len = customers.length;
        int richest = 0;
        for (int i = 0; i < len; i++) {
            int totalBal = 0;
//            System.out.println(Arrays.toString(customers[i]));
            for (int account : customers[i]){
                totalBal += account;

            }
            if (totalBal > richest){
                richest = totalBal;
            }
        }
        return richest;
    }
}
