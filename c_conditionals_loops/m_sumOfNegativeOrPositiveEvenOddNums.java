package com.dsa_bootcamp_assignments.c_conditionals_loops;

import java.util.ArrayList;
import java.util.Scanner;

public class m_sumOfNegativeOrPositiveEvenOddNums {
    public static void main(String[] args) {

        ArrayList<Integer> nums = inputs();

        System.out.println("Negative nums : " + negative(nums));
        System.out.println("Positive Even nums : " + positiveEven(nums));
        System.out.println("Positive Odd nums : " + positiveOdd(nums));

    }

    static ArrayList<Integer> inputs() {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        while (true) {
            int num = in.nextInt();
            if (num != 0) {
                nums.add(num);
            }
            if (num == 0) {
                break;
            }
        }
        return nums;
    }

    static int negative(ArrayList<Integer> nums) {
        int resN = 0;
        for (int element : nums) {
            if (element < 0) {
                resN += element;
            }
        }
        return resN;
    }

    static int positiveEven(ArrayList<Integer> nums) {
        int resPE = 0;
        for (int element : nums) {
            if (element > 0 && element % 2 == 0) {
                resPE += element;
            }
        }
        return resPE;
    }

    static int positiveOdd(ArrayList<Integer> nums) {
        int resPO = 0;
        for (int element : nums) {
            if (element > 0 && element % 2 != 0) {
                resPO += element;
            }
        }
        return resPO;
    }

}
