package com.dsa_bootcamp_assignments.P_Recursion.e_Strings;

import java.util.ArrayList;
import java.util.List;

public class f_isSubSequence_iteration {
    public static void main(String[] args) {
        String s = "abdgc";
        List<StringBuilder> tArr = subseq("ahbgdc");
        for (int i = 0; i < tArr.size(); i++) {
            if (tArr.get(i).toString().contains(s)) {
                System.out.println(true);
                return;
            }else {
                System.out.println(false);
                return;
            }
        }
    }

    static List<StringBuilder> subseq(String t) {
        List<StringBuilder> li = new ArrayList<>();
        li.add(new StringBuilder(" "));

        for (char c : t.toCharArray()) {
            int n = li.size();
            for (int i = 0; i < n; i++) {
                StringBuilder sB = new StringBuilder(li.get(i));
                sB.append(c);
                li.add(sB);
            }
        }

        return li;
    }
}
