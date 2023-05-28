package com.bootcoding_java;
public class First_ind_last_ind_same {
    public static void main(String[] args) {
        int num[]={7, 22, 19, 7, 45, 65,7};
        for (int i = 0; i < num.length ; i++) {
            if (num[0]==num[num.length-1]){

                System.out.println(num[i]);
            }else {
                System.out.println("first & last index are not same");
                break;
            }
        }
    }
}
