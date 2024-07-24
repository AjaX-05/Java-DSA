package com.dsa_bootcamp_assignments.c_conditionals_loops;

import java.util.Scanner;

public class g_averageMarks {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("No of courses ?");
        int numCourses = in.nextInt();
        System.out.println(marks(numCourses));
    }

    static double marks(int numCourses){
        System.out.println("Enter course marks for "+ numCourses + " Subjects.");
        double res = 0;
        int counter = 0;
        while (numCourses > 0){
            int subMark = in.nextInt();
            res = res + subMark;
            counter++;
            numCourses--;
        }
        return res / counter;
    }
}
