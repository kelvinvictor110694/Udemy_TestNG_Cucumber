package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Consecutivenumber {

    public static void main(String[] args) {
        int[] arr = {4,3,25,6,7,8,9,2,3,10};
        String[] names = {"kelvin", "victor", "rosanna"};

        List<String> convert = Arrays.asList(names);
        System.out.println("a"+convert.get(0));
        List<String> coverted = convert.stream().sorted().collect(Collectors.toList());
        System.out.println(coverted.get(0));
    }
}
