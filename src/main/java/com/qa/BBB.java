package com.qa;

import java.sql.SQLOutput;

public class BBB extends AAA {
    public int fooBar(){
        System.out.println("BBB::fooBar()");
        return 99;
    }

    @Override
    public void f1(){
        System.out.println("BBB::f1()");
    }
}