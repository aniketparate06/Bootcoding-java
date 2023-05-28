package com.java_methods;

public class Sum_of_array {
    public static void main(String[] args) {
        int sum=getSumOfArray(0);
        System.out.println(sum);
    }
    public static int getSumOfArray(int total){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            total=total+arr[i];
        }return total;
    }
}

