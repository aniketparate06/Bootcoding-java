package com.bootcoding_java;

public class Assignment_7 {
    public static void main(String[] args) {
        int num = 20;
        int sum = 0;
        System.out.println("The odd numbers are :");
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("The Sum of odd Natural Number upto 20 terms : "+sum);
    }
}
