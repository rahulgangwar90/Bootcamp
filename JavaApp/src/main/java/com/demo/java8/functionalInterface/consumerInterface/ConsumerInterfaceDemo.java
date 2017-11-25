package com.demo.java8.functionalInterface.consumerInterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


class A implements Consumer<Integer> {

    @Override
    public void accept(Integer i) {
        System.out.println("Integer : " + i);
    }
}


public class ConsumerInterfaceDemo {

    public static void main(String[] args) {
       andThenMethodExample();
    }

    void init(){
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("Inside consumer " + o);
            }
        };

        List list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(consumer);

        //using lambda expression
        Consumer consumerLambda = o -> System.out.println("Calling from lambda " + o);
        list.forEach(consumerLambda);
    }


    private static void andThenMethodExample() {
        Consumer<Integer> adder = (Integer s) -> System.out.println("Adder : "+ (s*2));
        Consumer<Integer> multiplier = (Integer s) -> System.out.println("Multiplier : "+ (s*s));

        adder.andThen(multiplier).accept(3);
    }
}
