package com.demo.java8.streams;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        operationOnListStream(Arrays.asList(2, 5, 3, 7, 1));
    }


    public static void operationOnListStream(List list) {
        Comparator<Integer> integerListSorter = (Integer o1, Integer o2) -> {

            if (o1.equals(o2))
                return 0;

            return (o1 > o2) ? 1 : -1;
        };

        System.out.println("Printing list in sorter order");
        System.out.println("------------------------------");
        list.stream().sorted(integerListSorter).forEach(i -> {
            System.out.println("Value : " + i);
        });
        
    }
}
