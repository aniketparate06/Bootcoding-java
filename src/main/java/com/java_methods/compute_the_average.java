package com.java_methods;

import java.util.Scanner;

public class compute_the_average {
    public static void main(String[] args) {
        int n1=getAvg(25,45,65);
        System.out.println(n1);
    }
    public static int getAvg(int num1,int num2,int num3){
        int count=3;
        int sum=(num1+num2+num3)/count;
        return sum;
    }
}

