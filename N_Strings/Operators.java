package com.dsa_bootcamp_assignments.N_Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));

        System.out.println("a" + 1);
//        this is same as after a few steps: "a" + "1"
//        integer will be converted to Integer that will call toString()

        System.out.println("Ajay" + new ArrayList<>());
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(0);
        myList.add(1);

        System.out.println("Ajay" + myList);


        String ans = new Integer(20) + "" + new ArrayList<>();
        System.out.println(ans);

    }
}
