package com.dsa_bootcamp_assignments.n_Strings_Problems;

import java.util.Arrays;

public class a_IPAddress {
    public static void main(String[] args) {
        String ip = "255.100.50.0";

        String[] splitted = ip.split("\\.");
        System.out.println(Arrays.toString(splitted));

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < splitted.length; i++) {
            if (i == 3) {
                res.append(splitted[i]);
                break;
            }
            res.append(splitted[i] + "[.]");
        }

        System.out.println(res);

//        System.out.println(splitted[0] + "[.]" + splitted[1] + "[.]" + splitted[2] + "[.]" + splitted[3]);
    }
}
