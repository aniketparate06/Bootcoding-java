package com.bootcoding_java;

public class Assignment_10 {
    public static void main(String[] args) {
        int num=4;
        int k=1;
        for (int i=1; i<=num; i++) {
            int j;
            for (j = 1; j <= i; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
