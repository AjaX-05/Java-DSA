package com.dsa_bootcamp_assignments.c_conditionals_loops;

import java.util.ArrayList;
import java.util.Scanner;

public class i_vowels_or_consonants {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(VowelOrNot(in.next()));
    }

    static boolean VowelOrNot(String word){
        char[] words = {'a','A','e','E','i','I','o','O','u','U'};

        ArrayList<Character> letterInWord = new ArrayList<Character>();

        for (char c: word.toCharArray()){
            letterInWord.add(c);
        }

        for (char element : words){
            if (letterInWord.contains(element)){
                return true;
            }
        }
        return false;
    }
}
