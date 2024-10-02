package com.dsa_bootcamp_assignments.N_Strings_Problems;

public class o_LongPressName {
    public static void main(String[] args) {
        String name = "alex";
        String name2 = "aaleex";
        System.out.println(func(name, name2));
    }

    static boolean func(String name, String name2) {
        int k = 0;

        for (int i = 0; i < name2.length(); i++) {
            if (k < name.length() && name2.charAt(i) == name.charAt(k)) {
                k++;
            } else if (i - 1 >= 0 && name2.charAt(i) == name2.charAt(i - 1)) {
//                Skip to i++
            } else {
                return false;
            }

        }

        if (k >= name.length()) {
            return true;
        }
        return false;
    }


}
