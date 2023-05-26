package com.java_methods;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        System.out.println("Enter Any Number");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        getEvenOdd(n1);
    }
    public static int getEvenOdd(int num){
        if (num%2==0){
            System.out.println("Even Number "+num);
        }else {
            System.out.println("odd number "+num);
        }return num;
    }
}
