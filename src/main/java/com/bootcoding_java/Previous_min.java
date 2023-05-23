package com.bootcoding_java;

public class Previous_min {
    public static void main(String[] args) {

                int[] numbers = {5, 9, 10, 2, 33};
                int min = numbers[0];
                int premin = 0;
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i]<min) {
                        premin=min;
                        min = numbers[i];
                    }

                }
                System.out.println("Previous minimum number is: "+premin);
            }
        }

