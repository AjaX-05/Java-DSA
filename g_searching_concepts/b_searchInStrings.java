package com.dsa_bootcamp_assignments.g_searching_concepts;

public class b_searchInStrings {
    public static void main(String[] args) {
        String name = "Ajay";
        char target = 'y';
        System.out.println(search(name,target));
    }

    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }

    static boolean search2(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (char ch: str.toCharArray()){
            if (target == ch){
                return true;
            }
        }

        return false;
    }
}
