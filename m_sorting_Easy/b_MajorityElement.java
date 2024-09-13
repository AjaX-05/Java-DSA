package com.dsa_bootcamp_assignments.m_sorting_Easy;

public class b_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, -1, -1, -1, -1, -1, -1, 2, 2, 23, 23, 23, 23, 3, 2};
        Bubblesort(nums);
        System.out.println(majorityCount(nums));

    }

    static void Bubblesort(int[] nums) {
        boolean isFalse;
        for (int i = 0; i < nums.length; i++) {
            isFalse = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    isFalse = true;
                }
            }
            if (!isFalse) {
                break;
            }
        }
    }

    static int majorityCount(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int finalCounter = 0;
        int finalNum = nums[0];
        int counter = 0;
        int num = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                counter++;
            } else {
                if (counter > finalCounter) {
                    finalNum = num;
                    finalCounter = counter;
                }
                counter = 1;
                num = nums[i];
            }

            if (num == nums[nums.length - 1]) {
                if (counter > finalCounter) {
                    finalNum = num;
                    finalCounter = counter;
                }
            }

        }
//        System.out.println(finalNum);
//        System.out.println(finalCounter);
        return finalNum;
    }
}