package com.java_methods;

import java.util.Scanner;

public class Find_negative_positive_zero {
    public static void main(String[] args) {
        System.out.println("Enter Any Number");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        getNegative_Positive_Zero(n1);
    }public static int getNegative_Positive_Zero(int num){
        if (num<0){
            System.out.println("Negative Number " +num);
        } else if (num>0) {
            System.out.println("positive Number " +num);

        }else {
            System.out.println("Number is zero");
        }return num;
    }
}
