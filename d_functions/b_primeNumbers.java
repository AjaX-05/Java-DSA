package com.dsa_bootcamp_assignments.d_functions;

import java.util.ArrayList;

public class b_primeNumbers {
    public static void main(String[] args) {
        System.out.println(primeNum(97));
    }

    static boolean primeNum(int num){
        int originalNum = num;
        ArrayList<Integer> arr = new ArrayList<>();
        while (num > 1){
            if (originalNum % num == 0){
                arr.add(num);
            }
            num--;
        }
        if (arr.size() == 1){
            return true;
        }

        return false;
    }
}
