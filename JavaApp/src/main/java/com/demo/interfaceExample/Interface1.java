package com.demo.interfaceExample;


public interface Interface1 {
    default void add() {
        System.out.println("Hi from interface 1");
    }

    static int subtract(int i, int j) {
        return (i - j);
    }

// we cannot override methods from Object Class
//    default boolean equals(Object obj){
//        return true;
//    }
}
