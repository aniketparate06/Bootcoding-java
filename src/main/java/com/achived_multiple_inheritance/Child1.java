package com.achived_multiple_inheritance;

public class Child1 implements Parent1, Parent2{
    @Override
    public void par1() {
        Parent1.super.par1();
    }

    public void par2(){
        Parent2.super.par2();
    }
}
