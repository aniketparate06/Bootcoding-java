package com.java_methods;

import java.util.Scanner;

public class find_the_smallest_number {
    public static int small_number(int num1, int num2, int num3) {
        while (true){
            if (num1 < num2) {
                if (num1 < num3) {
                    return num1;
                } else if (num2 < num3) {
                    return num2;
                } else {
                    return num3;
                }
            }
            return num1;
        }
    }
    public static void main(String[] args) {
        int wh=1;
        while (true){
            if (wh==1){
            System.out.println("Enter any Three Number");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int num = small_number(a, b, c);

            System.out.println("Smallest number from three number is");
            System.out.println(num);
            System.out.println("!!YOU WANT TO CONTINUE PRESS-1!!: ");
            System.out.println("!!FOR EXIT PRESS-0!!: ");
            wh=sc.nextInt();
            }else {
                break;
            }
        }
     }
}