package com.print;
public class PrintApp {
    public static void main(String[] args) {
        System.out.println("Single Message");
        PrintService printService=new PrintService();
        printService.message();
//*************************************////////////////////*********************************
        System.out.println("\nMultiple Message");
        String s2[]={"1,2,3","aniket","&**&","5,6,7"};
        printService.array_of_message(s2);
        System.out.println();
//**************************************//////////////////////********************************
        System.out.println("\nPrint Multiplication Table");
        printService.table(5);
        System.out.println();
        printService.table(37);
    }
}
