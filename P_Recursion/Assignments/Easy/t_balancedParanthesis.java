package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class t_balancedParanthesis {
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(check("", s));
    }

    static boolean check(String p, String up) {
        if (up.isEmpty()) {
            if (p.length() - 2 >= 0 && p.charAt(p.length() - 2) == '[' && p.charAt(p.length() - 1) == ']') {
                p = p.substring(0, p.length() - 2);
            }
            if (p.length() - 2 >= 0 && p.charAt(p.length() - 2) == '(' && p.charAt(p.length() - 1) == ')') {
                p = p.substring(0, p.length() - 2);
            }
            if (p.length() - 2 >= 0 && p.charAt(p.length() - 2) == '{' && p.charAt(p.length() - 1) == '}') {
                p = p.substring(0, p.length() - 2);
            }

            if (!p.isEmpty()) {
                return false;
            }
            return true;
        }

        char ch = up.charAt(0);

        if (p.length() - 2 >= 0 && p.charAt(p.length() - 2) == '[' && p.charAt(p.length() - 1) == ']') {
            p = p.substring(0, p.length() - 2);
        }
        if (p.length() - 2 >= 0 && p.charAt(p.length() - 2) == '(' && p.charAt(p.length() - 1) == ')') {
            p = p.substring(0, p.length() - 2);
        }
        if (p.length() - 2 >= 0 && p.charAt(p.length() - 2) == '{' && p.charAt(p.length() - 1) == '}') {
            p = p.substring(0, p.length() - 2);
        }

        return check(p + ch, up.substring(1));

    }


}