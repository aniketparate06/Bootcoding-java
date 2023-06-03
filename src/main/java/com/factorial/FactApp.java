package com.factorial;
public class FactApp {
    public static void main(String[] args) {
//  *************************Memory Allocation********************
        FactorialService factorialService=new FactorialService();

//***************************single message**********************************************

//**************************Object Calling 1St Trick**************
        System.out.println("single message");
        System.out.println("factorial of: 5 ="+factorialService.getFact(5));

//**************************Object Calling 2nd Trick***************
        int num1=factorialService.getFact(7);
        System.out.println("factorial of: 7 ="+num1);
        System.out.println();

//********************************multiple message*****************************************
        System.out.println("multiple message using array");
        int numbers[]={5,1,2,3,7,10};
        int result[]=factorialService.getFacts(numbers);
        for (int i = 0; i < result.length; i++) {
            System.out.println("factorial of: " +numbers[i] +" = " + result[i] + " ");
        }
    }
}
