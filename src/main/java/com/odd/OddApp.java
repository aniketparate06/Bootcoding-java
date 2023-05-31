package com.odd;

public class OddApp {
    public static void main(String[] args) {
        OddNumber oddNumber=new OddNumber();
        boolean num1= oddNumber.isOdd(4);
        System.out.println(num1);

        int nums[]={1,3,7,9,5};
        boolean nums1=oddNumber.allOdd(nums);
        System.out.println(nums1);
    }
}
