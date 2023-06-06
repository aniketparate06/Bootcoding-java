package com.cube;

public class CubeService {
    public int getCube(int num){
        int res=num*num*num;
        return res;
    }

//**************************************************
    public int[] getCubes(int[]numbers){
        int[] cube=new int[numbers.length];
        for (int i=0; i<=numbers.length-1; i++){
            cube[i]=getCube(numbers[i]);
        }return cube;
    }
}
