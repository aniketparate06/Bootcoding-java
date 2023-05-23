package com.bootcoding_java;

public class Array_max_value {
    public static void main(String[] args) {
        int numbers[]={45,78,89,143,142};
        int max=numbers[0];

        for (int i = 0; i <numbers.length ; i++) {
              if (numbers[i]>max){
                  max=numbers[i];
              }
        }
        System.out.println("maximum value of array is "+max);
    }
}
