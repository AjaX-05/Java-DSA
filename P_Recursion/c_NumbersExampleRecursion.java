package com.dsa_bootcamp_assignments.P_Recursion;

public class c_NumbersExampleRecursion {
    public static void main(String[] args) {

        print(1);
    }

    static void print(int n) {

//        Base Condition
//        To stop the Recursion
        if (n > 5) {
            return;
        }

        System.out.println(n);

//        This is called Tail Recursion
//        This is the last function call
        print(n + 1); // Recursive Call
//        When a function is called again and again, you can treat
//        it as a separate call in the stack
//        Recursion formulae is called as Recurrence Relation
    }
}
