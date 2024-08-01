package com.dsa_bootcamp_assignments.g_searching_concepts;

public class c_searchInRange {

    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 34, 54, 21, 45, -324};
        int target = 34;
//    range 3,6;

        int start = 3;
        int end = 6;

        System.out.println(search(arr, target, start, end));
    }

    static boolean search(int[] nums, int target, int start, int end) {
        if (nums.length == 0) {
            return false;
        }

        for (int i = start; i < end; i++) {
            if (nums[i] == target) {
                return true;
            }
        }

        return false;
    }
}
