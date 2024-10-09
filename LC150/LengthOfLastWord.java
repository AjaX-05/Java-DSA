package com.dsa_bootcamp_assignments.LC150;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        String[] arr = s.split(" ");
        System.out.println(arr[arr.length - 1].length());
    }
}
