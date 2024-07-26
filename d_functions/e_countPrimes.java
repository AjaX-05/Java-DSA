package com.dsa_bootcamp_assignments.d_functions;

import java.util.ArrayList;

public class e_countPrimes {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 0; i < 10; i++) {
            if (isPrime(i) != -1){
                counter++;
            }
        }
        System.out.println(counter);
    }


    static int isPrime(int num) {
        int originalNum = num;
        ArrayList<Integer> myList = new ArrayList<>();
        ArrayList<Integer> primeList = new ArrayList<>();
        while (num > 1) {
            if (originalNum % num == 0) {
                myList.add(num);
            }
            num = num--;
        }
        if (myList.size() == 1){
            primeList.add(myList.get(0));
            return primeList.get(0);
        }
//        System.out.println(primeList);
        return -1;
    }
}
