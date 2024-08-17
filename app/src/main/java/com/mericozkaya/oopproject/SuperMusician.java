package com.mericozkaya.oopproject;

public class SuperMusician extends Musician {


    public SuperMusician(String name, String instrument, int age) {
        super(name, instrument, age);

        //constructor olduğu için burada da constructor olmalı
    }

    public String sing(){
        return "Nothing Else Maters";
    }
}
