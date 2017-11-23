package com.demo;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> integerList = Arrays.asList(1,2,3,4);
        forEachExampleOnList(integerList);
    }

    public static void forEachExampleOnList(List<Integer> list){
        list.forEach(i -> System.out.println(i));
    }
}
