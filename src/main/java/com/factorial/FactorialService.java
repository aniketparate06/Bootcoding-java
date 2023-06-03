package com.factorial;
public class FactorialService {
//********************* print single number output************************
    public int getFact(int num){
        int fact=1;
        for (int i = 1; i <=num ; i++) {
            fact=fact*i;
        }
        return fact;
    }
//*******************print multiple number output***************************
    public int[] getFacts(int[] numbers){
        int[] fact=new int[numbers.length];
        for (int i = 0; i <=numbers.length-1 ; i++) {
            fact[i]=getFact(numbers[i]);
        }
        return fact;
    }
}
