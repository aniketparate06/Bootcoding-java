package com.bootcoding_java;

public class Array_min_value {
    public static void main(String[] args) {
        int numbers[]={4,7,6,45,37,100};
        int min=numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println("Minimum number in array is: "+min);
    }
}
