package com.armstrong;
public class ArmstrongService {
//    *****************************Single Message Logic***********************************
    public  int getArmstrong(int num){
        int temp=num;
        int pow=0;
        while (num>0){
            int rem=num%10;
            pow=(pow)+rem*rem*rem;
            num=num/10;
        }if (temp==pow){
            System.out.println(temp +" is Armstrong Number");
        }else{
            System.out.println(temp +" is not Armstrong");
        }return num;
    }

//***************************Multiple Message logic using Array******************************
    public int[] getArmstrongs(int numbers[]){
        int arm[]=new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arm[i]=getArmstrong(numbers[i]);
        }
        return arm;
    }
}
