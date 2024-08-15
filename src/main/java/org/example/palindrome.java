package org.example;

public class palindrome {
    public static void main(String[] args) {
        int num = -121;
        int reversednum = 0;
        int reminder;

        int originalnum = num;
        while(num !=0){
            reminder = num % 10;
            reversednum = reversednum*10 + reminder;
            System.out.println("reversed num :"+reversednum);
            num = num/10;
            System.out.println("num is :"+num);
        }
        if (originalnum == reversednum)
        System.out.println("it is a palindrome");
        else
            System.out.println("not a palindrome");
    }
}