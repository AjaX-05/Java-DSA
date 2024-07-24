package com.dsa_bootcamp_assignments.a_flow_of_program;

import java.util.Scanner;

public class C_MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a table Number and Size Number: ");
        int tableInp = in.nextInt();
        int sizeInp = in.nextInt();

//
        int initial = 1;
        while (initial <= sizeInp){
            System.out.println(tableInp * initial);
            initial++;
        }
    }
}
