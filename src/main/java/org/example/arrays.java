package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class arrays {
    public static void main(String[] args) {
        /*ArrayList<String> a = new ArrayList<String>();
        String[] name ={"kelvin","victor"};
        List<String> b= Arrays.asList(name);
        b.contains("victor");*/
        arrays array = new arrays();
        array.split();
        equals();
        merge();

    }

    public void split(){
        String value = "kelvin 'victor' is";
        String[] splitvalue = value.split("'");
        for (int i =0; i<splitvalue.length;i++) {
            System.out.println(splitvalue[i]);
        }
        String finals = splitvalue[1];
        System.out.println(finals);
    }

    public static void equals(){
        String s = "kelvin";
        String s1 = new String("kelvin");
        System.out.println(s==s1);
    }

    public static void merge(){
         int a[] = {1,3,5,7,9} ;
         int b[]={2,4,6,8};

         List<Integer> a1 = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> b1 = Arrays.stream(b).boxed().collect(Collectors.toList());
        List<Integer> merge = Stream.concat(a1.stream(),b1.stream()).sorted().collect(Collectors.toList());
        System.out.println(merge.toString());



    }
}

