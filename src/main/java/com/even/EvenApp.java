package com.even;
// Print Even No using SIngle Value and Multple value 
public class EvenApp {
    public static void main(String[] args) {
        EvenNumber even=new EvenNumber();
        System.out.println(even.isEven(8));
        int[]nums={4,2,4,8};
        System.out.println(even.allEven(nums));
    }
}
