package com.cube;

public class CubeServiceApp {
    public static void main(String[] args) {
        CubeService cubeService=new CubeService();
        int num=3;
        int result=cubeService.getCube(num);
        System.out.println("Single Message");
        System.out.println("cube of "+num+ " is "+result+"\n");

//**********************************************************************

        System.out.println("Multiple Message Using Array");
        int numbers[]={5,4,9,7,8};
        int results[]=cubeService.getCubes(numbers);
        for (int i=0; i<results.length; i++){
            System.out.println("cube of "+ numbers[i]+ " is "+results[i]);
        }
    }
}
