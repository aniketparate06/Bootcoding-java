package com.bootcoding_java;

public class Mins_to_sec {
    public static void main(String[] args) {
        int mins[]={3,5,10,23,60};
        for (int i = 0; i < mins.length; i++) {
            int sec=mins[i]*60;
            System.out.println(mins[i]+" mins * 60 = "+sec+" seconds");
        }
    }
}
