package com.dsa_bootcamp_assignments.m_sorting_Easy;

public class c_containsDuplicate {
    // TIME LIMIT EXCEEDED ERROR
    public static void main(String[] args) {
//        int[] nums = {-761, -253, 337, -219, -22, -936, 374, 972, 491, 572, -807, -419, -296, 290, -412, -19, 236, 640, -197, -507, -629, 957, -751, 499, 678, 282, 645, 161, -893, 334, 226, -953, -579, 824, -69, -1, 658, -594, 946, -265, 878, 478, 577, 607, 233, -556, 760, -212, -368, -827, -870, 44, -194, -886, 954, -23, 478, -8, 64, 763, -79, -729, -857, -269, 541, -793, -304, 303, -848, 77, 984, 953, -821, 423, -40, 31, 424, 933, 111, 442, -191, 309, 514, -497, -493, 437, -862, -140, 334, 978, 971, 748, 614, -544, 827, 91, -90, -737, -301, -731, -696, -20, -641, 641, -924, 69, -548, -981, -205, -407, 401, 202, 854, 215, 414, -53, 973, -7, 936, -435, 778, -821, -407, -606, -910, 386, 212, -512, -247, -742, -200, -949, 972, 938, -151, -421, 745, 391, -30, 492, -630, -17, 787, 583, 933, 721, 198, -746, 416, 672, 135, -955};
//        bubbleSort(nums);
//
//        System.out.println(Arrays.toString(nums));
//
//        System.out.println(Duplicate(nums));
    }


    static void bubbleSort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static boolean Duplicate(int[] nums) {

        int counter = 0;
        int finalCounter = counter;
        int num = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                counter++;
            } else {
                counter = 1;
                num = nums[i];
            }

            if (counter >= 2) {
                return true;
            }
        }

        return false;
    }


}
