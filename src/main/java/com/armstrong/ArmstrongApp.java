package com.armstrong;
public class ArmstrongApp {
    public static void main(String[] args) {
//************************getArmstrong method call-------Single Message Display*******************************************
        System.out.println("Single Message Using Array");
        ArmstrongService armstrongService=new ArmstrongService();
        armstrongService.getArmstrong(371);
        System.out.println();

//*************************getArmstrongs method call------Multiple Message Display*******************************************
        System.out.println("Multiple Message Using Array");
        int numbers[]={371,515,407,1000,153,370};
        int res[]=armstrongService.getArmstrongs(numbers);
        for (int i = 0; i < res.length; i++) {
        }
    }
}
