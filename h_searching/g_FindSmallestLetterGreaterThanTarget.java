package com.dsa_bootcamp_assignments.h_searching;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class g_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'e', 'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};
        char target = 'e';


        System.out.println(findLetter(letters, target));
    }

    static char findLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        if (target >= letters[end]) {
            return letters[start];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > letters[mid]) {
                start = mid + 1;
            } else if (target < letters[mid]) {
                end = mid - 1;
            } else {
                if (letters[mid] == letters[mid + 1]) {
                    start = mid + 1;
                } else {
                    return letters[mid + 1];
                }
            }
        }
        return letters[start];
    }
}
