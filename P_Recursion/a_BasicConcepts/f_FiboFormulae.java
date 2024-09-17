package com.dsa_bootcamp_assignments.P_Recursion.a_BasicConcepts;

public class f_FiboFormulae {

//    Formulae 1/ Root(5) {((1+ Root(5))/2) pow n - ((1- Root(5))/2) pow n}

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(fiboFormulae(i));
//        }

        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int i) {
        return (int) (1 / Math.sqrt(5) * (Math.pow((1 + Math.sqrt(5)) / 2, i) - Math.pow((1 - Math.sqrt(5)) / 2, i)));
//        return (int) (1 / Math.sqrt(5) * (Math.pow(1.618, i) - Math.pow(-0.618, i)));
//        return (int) (1 / Math.sqrt(5) * (Math.pow(1.618, i)));
    }
}
