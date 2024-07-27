package com.dsa_bootcamp_assignments.e_arrays;

public class j_Pangram {

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        char[] aToz = new char[26];
        int counter = 0;
        char i;
        for (i = 'a'; i <= 'z' ; i++) {
            aToz[counter] = i;
            counter++;
        }
        System.out.println(aToz);

        int counter2 = 0;
        for (char element: sentence.toCharArray() ){
            for (char alpha: aToz){
                if (alpha == element){
                    counter2++;
                }
            }
        }

        System.out.println(counter2);
    }

}
