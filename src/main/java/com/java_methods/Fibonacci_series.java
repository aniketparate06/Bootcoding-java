package com.java_methods;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        System.out.println("Enter Number For Fibonacci Series");
        Scanner sc=new Scanner(System.in);
        int fibo=sc.nextInt();
        getFibonacciSeries(fibo);

    }
    public static int getFibonacciSeries(int num){
        int n1=0,n2=1,n3;
        for (int i = 0; i < num; i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);

        }return num;
    }
}
