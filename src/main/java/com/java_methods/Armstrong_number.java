package com.java_methods;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        getArmstrongNumber(num1);
    }
    public static int getArmstrongNumber(int num){

        int temp=num;
        int pow=0;
        while (num>0){
            int rem=num%10;
            pow=(pow)+rem*rem*rem;
            num=num/10;
        }if (temp==pow){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is Not armstrong");
        }return num;
    }
}
