package com.dsa_bootcamp_assignments.a_flow_of_program;

import java.util.Scanner;

public class E_SumOfAll {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int res = 0;

        while (true){
            int input1 = input.nextInt();
            if ((char)(input1) == 'x'){
                break;
            }
            res = res + input1;
            }

        System.out.println(res);
        }

    }

