package com.dsa_bootcamp_assignments.c_conditionals_loops;

import java.util.Scanner;

public class l_evenDaysOfMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter month 1-12: ");
        int res = evenDaysOfMonth(in.nextInt());
        System.out.println(res + " even days.");
    }

    static int evenDaysOfMonth(int month) {
        int res = 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12, 4, 6, 9, 11:
                int days31 = 31;
                while (days31 > 0) {
                    if (days31 % 2 == 0) {
                        res += 1;
                    }
                    days31--;
                }
                break;

            case 2:
                int days28 = 28;
                while (days28 > 0) {
                    if (days28 % 2 == 0) {
                        res += 1;
                    }
                    days28--;
                }
                break;
//          We can combine above 2 cases, since 30/31 % 2 == 0 Gives Same Res.
            default:
                System.out.println("Invalid Input");
                break;
        }
        return res;
    }


}
