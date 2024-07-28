package com.dsa_bootcamp_assignments.e_arrays;
//https://leetcode.com/problems/count-items-matching-a-rule/
import java.util.*;

public class k_CountItemsMatchingaRule {
    public static void main(String[] args) {

        List<List<String>> items = new ArrayList<>();

        // Add the elements
        items.add(new ArrayList<>(List.of("phone", "blue", "pixel")));
        items.add(new ArrayList<>(List.of("computer", "silver", "lenovo")));
        items.add(new ArrayList<>(List.of("phone", "gold", "iphone")));

        String ruleKey = "type";
        String ruleValue = "phone";

        int count = 0;

        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < items.get(i).size(); j++) {
//                System.out.println(items[i][j]);
                if (ruleKey == "type") {
                    if (items.get(i).get(j) == ruleValue) {
                        count++;
                    }
                }
                if (ruleKey == "color") {
                    if (items.get(i).get(j) == ruleValue) {
                        count++;
                    }
                }
                if (ruleKey == "name") {
                    if (items.get(i).get(j) == ruleValue) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }


}
