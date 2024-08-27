package com.dsa_bootcamp_assignments.O_Patterns;

public class Main {
    public static void main(String[] args) {
        pattern12(5);
    }

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = n; col > row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    static void pattern4(int n) {
//        for (int row = 0; row < n; row++) {
//            int num = 0;
//            for (int col = 0; col <= row; col++) {
//                num++;
//                System.out.print(num+" ");
//            }
//            System.out.println();
//        }
//    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < (2 * n); row++) {
            int totalColsInRow = row > n ? (2 * n) - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = n; col > row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 1; col < n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 0; row < n; row++) {
            for (int i = 0; i < row; i++) {
                System.out.print(" ");
            }
            for (int i = n * 2 - row * 2; i > 1; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 1; row <= n * 2 ; row++) {
            int shade = row > n ? 2 * n - row : row -1;
            for (int col = 0; col < shade; col++) {
                System.out.print(" ");
            }
            int totalColsInRow = row > n ? row - n : n - row + 1;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < (2 * n); row++) {
            int spaces = row > n ? row - n : n - row;
            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }
            int totalColsInRow = row > n ? (2 * n) - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
