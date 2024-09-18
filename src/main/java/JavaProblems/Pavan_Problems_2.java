package JavaProblems;

import java.util.*;
import java.util.stream.Collectors;

public class Pavan_Problems_2 {
    public static void main(String[] args) {
        duplicateelemtsinArray();
    }
    public static void checkArrayEqual (){
        int a1[] = {3,5,63,4,66};
        int a2[] = {3,5,63,3,66};
        System.out.println(Arrays.equals(a1,a2));

    }
    public static void missingNo(){
        int a[] = {1,2,4,6,7,8,9};
        List<Integer> li = Arrays.stream(a).boxed().collect(Collectors.toList());
        for (int i =1;i< li.size();i++){
            if (!li.contains(i))
                System.out.println(i);
        }
    }
    public static void maxAndMinValues(){
        int a1[] = {99,3,5,63,4,66};
        int temp =0;
        for (int i =0;i<a1.length;i++){
            for (int j =0;j<a1.length-1;j++){
                if (a1[j]>a1[j+1]){
                    temp = a1[j+1];
                    a1[j+1] = a1[j];
                    a1[j] = temp;
                }
            }
        }
        System.out.println("min value "+a1[0]);
        System.out.println("min value "+a1[a1.length-1]);
    }
    public static void duplicateelemtsinArray(){
        int a1[] = {99,3,5,3,63,4,66};
        
    }
}
