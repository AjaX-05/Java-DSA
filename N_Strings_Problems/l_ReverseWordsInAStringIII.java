package com.dsa_bootcamp_assignments.N_Strings_Problems;

import java.util.Arrays;

public class l_ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Mr Ding";
        String[] sArr = s.split(" ");

        String[] resArr = new String[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = sArr[i].length() - 1; j >= 0; j--) {
                temp.append(sArr[i].charAt(j));
            }
            resArr[i] = temp.toString();
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < resArr.length; i++) {
            if (i == resArr.length - 1) {
                res.append(resArr[i]);
                break;
            }
            res.append(resArr[i] + " ");
        }

        System.out.println(res);
    }
}
