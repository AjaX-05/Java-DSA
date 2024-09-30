package com.dsa_bootcamp_assignments.N_Strings_Problems;

import java.util.ArrayList;
import java.util.List;

public class d_countsItemsMatchingARule {
    public static void main(String[] args) {
        String[][] arr = {
                {"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "gold", "iphone"}
        };

        String ruleKey = "type";
        String ruleValue = "phone";
        int count = 0;

        if (ruleKey == "color") {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][1].equals(ruleValue)) {
                    count++;
                }
            }
        } else if (ruleKey == "type") {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][0].equals(ruleValue)) {
                    count++;
                }
            }
        } else {
//            name
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][2].equals(ruleValue)) {
                    count++;
                }
            }
        }



        System.out.println(count);
    }
}
