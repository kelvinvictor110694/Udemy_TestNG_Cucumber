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
        /*arrays array = new arrays();
        array.split();
        equals();
        merge();*/
        repetativeElements();
        missingNo();

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

    public static void repetativeElements(){
        int a[]= {10,20,30,40,50,30,30};
        int element = 30;
        int counter =0;
        for (int i =0;i<a.length;i++){
            if (a[i]==element){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void missingNo(){
        int a[]={1,4,5,3};
        int size =10;
        List<Integer> a1 = Arrays.stream(a).boxed().collect(Collectors.toList());
        for (int i =1;i<size;i++){
            if (!a1.contains(i)){
                System.out.println(i);
            }
        }
    }
}

