package com.dsa_bootcamp_assignments.P_Recursion.e_Strings;

public class a_Stream {
    public static void main(String[] args) {
        String word = "aapappapple";
        StringBuilder ans = new StringBuilder();

        System.out.println(skipAppNotApple(word));

//        skip(word, ans);
//        System.out.println(ans);

//                int n = 0;
//        skip(word, ans, n);
//        System.out.println(ans);

    }

    static String skipAppNotApple(String word) {
        if (word.isEmpty()) {
            return "";
        }

        if (!word.startsWith("apple") && word.startsWith("app")) {
            return skipAppNotApple(word.substring(3));
        }
        return word.charAt(0) + skipAppNotApple(word.substring(1));

    }


    static String skipApple(String word) {
        if (word.isEmpty()) {
            return "";
        }

        if (word.startsWith("apple")) {
            return skipApple(word.substring(5));
        }
        return word.charAt(0) + skipApple(word.substring(1));

    }

    static String skip(String word) {
        if (word.isEmpty()) {
            return "";
        }

        if (word.charAt(0) != 'a') {
            return word.charAt(0) + skip(word.substring(1));
        }
        return skip(word.substring(1));
    }


//    static void skip(String word, StringBuilder ans) {
////Base Condition
//        if (word.equals("")) {
//            return;
//        }
//
////        Skips a and appends other chars
//        if (word.charAt(0) != 'a') {
//            ans.append(word.charAt(0));
//        }
//
////        Recursive Relation
//        skip(word.substring(1), ans);
//    }


//    static void skip(String word, StringBuilder ans, int n) {
//
//        if (n == word.length()) {
//            return;
//        }
//
//        if (word.charAt(n) != 'a') {
//            ans.append(word.charAt((n)));
//        }
//
//        skip(word, ans, n + 1);
//
//    }


}