package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinousArray {

    public static void main(String[] args) {
        sumArray();
        missingNo();
        missingno2();
    }

    public static void sumArray(){
        int[]a={1, 2, 3, 4 , 5, 6, 7, 8, 10};
        int arraysum =0;
        for (int i =0; i<a.length; i++){
            arraysum = arraysum + a[i];
        }
        System.out.println("sum array "+arraysum);
    }

    public static void missingNo(){
        int[]a={1, 2, 3, 4 ,5, 6, 7, 8, 10};
        List<Integer> arrint = new ArrayList<Integer>();
        for (int num:a) {
            arrint.add(num);
        }
        for (int i =1; i<10;i++) {
            if (!arrint.contains(i)){
                System.out.println("missing no "+i);
            }
        }
    }

    public static void missingno2(){
        int[] arr={1,3,5,7,9,8,4};
        int max = 9;
        Arrays.sort(arr);
        List<Integer> arr2 = new ArrayList<>();
        for (int i =0; i<arr.length;i++){
            arr2.add(arr[i]);
        }
        for (int i =1; i<max;i++){
            if (!arr2.contains(i)){
                System.out.println("Missing no2 "+i);
            }
        }
    }
}
