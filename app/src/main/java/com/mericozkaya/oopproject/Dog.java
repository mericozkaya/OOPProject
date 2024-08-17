package com.mericozkaya.oopproject;

public class Dog extends Animal{

    //dog bir hayvan olduğu için hayvan sınıfndan miras alıyor extend

    public void test(){
        super.sing();
    }

    public void sing(){
        System.out.println("Dog class");
    }

}
