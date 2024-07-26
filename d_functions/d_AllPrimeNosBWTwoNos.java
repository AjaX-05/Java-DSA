package com.dsa_bootcamp_assignments.d_functions;

import java.util.ArrayList;

public class d_AllPrimeNosBWTwoNos {
    public static void main(String[] args) {
        System.out.println(frLoop(0,10).reversed());
    }

    static ArrayList<Integer> frLoop(int start, int end){
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> myPrimeList = listOfPrime(end);
        for (int element: myPrimeList){
            if (element > start && element < end){
                result.add(element);
            }
        }
        return result;
    }

    static ArrayList<Integer> listOfPrime(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (n > 1) {
            int res = isPrime(n);
            if (res != -1) {
                list.add(res);
            }
            n--;
        }
        return list;
    }


    static int isPrime(int num) {
        int originalNum = num;
        ArrayList<Integer> nums = new ArrayList<>();
        while (num > 1) {
            if (originalNum % num == 0) {
                nums.add(num);
            }
            num--;
        }
        if (nums.size() == 1) {
            return nums.get(0);
        }
        return -1;
    }
}
