package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Javastreams {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("kelvin");
        list.add("victor");
        list.add("kavin");

        String[] rollno = {"123","456","789"};
        List<String> rno = Arrays.asList(rollno);
        //no if strings that start with letter k
        Long count = list.stream().filter(value -> value.startsWith("k")).count();
        System.out.println(count);
        //print strings with value more than 5
        list.stream().filter(value -> value.length()>5).forEach(value-> System.out.println(value));
        //print 1st value with string length more than 5
        list.stream().filter(value -> value.length()>5).limit(1).forEach(value -> System.out.println(value));
        //using map to manipulate the values of a string
        list.stream().filter(value -> value.length()>5).map(value -> value.toUpperCase()).forEach(value -> System.out.println(value));
        //sorting a list
        list.stream().sorted().forEach(value -> System.out.println(value));
        //merge two arrays
        Stream<String> mergelist = Stream.concat(list.stream(),rno.stream());
        mergelist.forEach(value -> System.out.println(value));
        //check for a string
        boolean condition = list.stream().anyMatch(value -> value.equalsIgnoreCase("kelvin"));
        System.out.println(condition);
        //move values to a new list
        List<String> list2 = list.stream().filter(value -> value.endsWith("r")).collect(Collectors.toList());
        list2.stream().forEach(value-> System.out.println(value));
        //take only the distinct values
        List<Integer> numbers = Arrays.asList(9, 0, 8, 0, 8, 6, 8, 7, 3, 3);
        List<Integer> distinctint =numbers.stream().distinct().collect(Collectors.toList());
        distinctint.stream().forEach(value -> System.out.println(value));
    }
}
