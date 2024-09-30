package com.dsa_bootcamp_assignments.N_Strings_Problems;

public class e_SortingTheSentence {
    public static void main(String[] args) {
        String s = "sentence4 a3 is2 This1";
        String[] sArr = s.split(" ");
        String[] resArr = new String[sArr.length];
        StringBuilder res = new StringBuilder();
//        System.out.println(sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            int j = Integer.parseInt(String.valueOf(sArr[i].charAt(sArr[i].length() - 1))) - 1;
            resArr[j] = (sArr[i].substring(0, sArr[i].length() - 1));
        }

        for (int i = 0; i < resArr.length; i++) {
            if (i == resArr.length-1){
                res.append(resArr[i]);
                break;
            }
            res.append(resArr[i]).append(" ");
        }

        System.out.println(res);

    }
}