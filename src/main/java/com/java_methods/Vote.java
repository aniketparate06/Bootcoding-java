package com.java_methods;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        System.out.println("Enter Your Age");
        Scanner sc=new Scanner(System.in);
        int ag=sc.nextInt();
       getVote(ag);
    }
    public static int getVote(int age){
        if (age<18){
            System.out.println("Not Eligible For Vote");
        }else {
            System.out.println("Eligible For Vote");
        }return age;
    }
}
