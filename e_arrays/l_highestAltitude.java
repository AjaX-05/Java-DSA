package com.dsa_bootcamp_assignments.e_arrays;
//https://leetcode.com/problems/find-the-highest-altitude
public class l_highestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};

        int[] res = new int[gain.length+1];

        res[0] = 0;
        int counter = 0;
        for (int i = 0; i < gain.length; i++) {
            counter += gain[i];
            res[i+1] = counter;
        }

        int highest = 0;
        for(int num: res){
            if (num > highest){
                highest = num;
            }
        }
        System.out.println(highest);
    }
    
}
