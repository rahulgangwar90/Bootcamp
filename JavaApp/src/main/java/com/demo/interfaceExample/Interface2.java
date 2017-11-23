package com.demo.interfaceExample;


public interface Interface2 {

    void myMethod();

    default void add(){
        System.out.println("Hi from interface 2");
    }
}
