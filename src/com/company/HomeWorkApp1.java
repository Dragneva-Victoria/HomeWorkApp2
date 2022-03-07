package com.company;

public class HomeWorkApp1 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) { // задание 4
            for (int j = 0; j < 3; j++) {
                System.out.print("I'm Victoria ");
            }
            System.out.println();
        }
    }
    public static boolean compareNumber( int x, int y) { // задание 1
        int sum = x + y;
        if (sum >= 10 & sum <= 20) {
            return true;
        } else {
            return false;

        }

    }

    public static void numberPositiveOrNegative(int x) { // задание 2
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean truePositiveFalseNegative(int m) { // задание 3
        if (m >= 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean compareMoths(int x) {  // задание 5

        if ((x % 4 == 0) & (x % 100 != 0) || (x % 400 == 0) );
        {
            return true;
        } else {
            return false;
        }
    }
}




