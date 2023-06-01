package com.pattern;
public class time {
    public static void main(String[] args) {
//  ********************************First Half****************************

        for (int i = 5; i >=1 ; i--) {
            for (int j = 5; j >i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//  ***************************Second Half**********************************

        for (int i = 2; i <=5 ; i++) {
            for (int j = 5; j>i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
