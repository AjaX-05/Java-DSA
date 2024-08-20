package com.dsa_bootcamp_assignments.N_Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Ajay Shankar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.toUpperCase());

        System.out.println(name.indexOf('y'));
        System.out.println(name.lastIndexOf('a'));

        System.out.println("    Aj ay   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
