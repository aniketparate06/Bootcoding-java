package com.bootcoding_java;

public class Year_to_months {
    public static void main(String[] args) {
        float year[]={1, 2.5f, 3.2f, 10.5f};
        for (int i = 0; i < year.length; i++) {
           int month= (int) (year[i]*12);
            System.out.println(year[i]+" year * 12 = "+month+" months");
        }
    }
}
