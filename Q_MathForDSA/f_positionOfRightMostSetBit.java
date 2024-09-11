package com.dsa_bootcamp_assignments.Q_MathForDSA;

public class f_positionOfRightMostSetBit {
    public static void main(String[] args) {
        int num = 101101100;
        int position = rmSetb(num);
        System.out.println(position);
    }

    static int rmSetb(int n) {
        int isolatedBit = n & -n;

        int position = (int) (Math.log(isolatedBit)/Math.log(2) +1);
        return position;
    }
}
