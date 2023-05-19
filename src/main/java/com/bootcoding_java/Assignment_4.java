package com.bootcoding_java;

public class Assignment_4 {
    public static void main(String[] args) {

        float sum = 0;
        float num = 5;
        for (int i = 1; i <= num; i++) {
            sum = sum + (float) 1 / i;
        }
        System.out.println("sum of harmonic series is " + sum);
    }
}
