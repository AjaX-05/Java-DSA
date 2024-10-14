package com.dsa_bootcamp_assignments.P_Recursion.Assignments.Easy;

public class m_ProductOf2Nums {
    public static void main(String[] args) {
        int x = 100;
        int y = 5;
        System.out.println(product(0, x, y));
    }

    static int product(int p, int up1, int up2) {
        if (up1 == 0 || up2 == 0) {
            return p;
        }
        if (up1 > up2) {
            return product(p + up1, up1, up2 - 1);
        } else {
            return product(p + up2, up1 - 1, up2);
        }
    }

}
