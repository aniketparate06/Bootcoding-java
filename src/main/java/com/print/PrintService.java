package com.print;
public class PrintService {
//    *******************Single Message*********************
    public void message(){
        System.out.println("Hello");
    }

//    ******************Multiple Message**************************
    public void array_of_message(String[] s1){
        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i]+"  ");
        }
    }
//    ********************Multiplication Table**********************
    public void table(int num){
        for (int i = 1; i <=10; i++) {
            int num1=num*i;
            System.out.print(num1+"  ");
        }
    }
}
