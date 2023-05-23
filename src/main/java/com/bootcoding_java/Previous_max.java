package com.bootcoding_java;

public class Previous_max {
    public static void main(String[] args) {
        int numbers[]={5,4,3,7,8,9};
        int max=numbers[0];
        int pre_max=0;
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]>max){
                pre_max=max;
                max=numbers[i];
            }
        }
        System.out.println("previous maximum value is: "+pre_max);
    }
}
