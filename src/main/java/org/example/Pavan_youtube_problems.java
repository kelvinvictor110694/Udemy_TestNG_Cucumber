package org.example;

import org.openqa.selenium.support.ui.Select;

import javax.swing.Action;

public class Pavan_youtube_problems {

    public static void main(String[] args) {
        //largestNoWithoutIf();
        //findNoOfUpperLowerCase();
        //noOfDigits();
        evenodd();
    }

    public static void largestNoWithoutIf(){
        int a =10, b= 20;
        int max = (a>b) ? a: b;
        System.out.println("largest number is "+max);
    }
    public static void findNoOfUpperLowerCase(){
        String s = "Welcome TO AutomatioN";
        int upper =0, lower =0;
        for (int i =0;i<s.length();i++){
            if (s.charAt(i)>= 'A' && s.charAt(i)<='Z')
                upper++;
            else
                lower++;
        }
        System.out.println(lower);
        System.out.println(upper);


    }

    public static void noOfDigits(){
        int a = 907675639;
        int count =0;
        while (a>0){
            a= a/10;
            count++;
        }
        System.out.println(count);

    }

    public static void evenodd(){
        int a = 907675639;
        int even =0, odd =0;
        while (a>0) {
            int reminder = a % 10;
            a = a/10;
            if (reminder %2 ==0){
                even++;
            } else
            odd++;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
