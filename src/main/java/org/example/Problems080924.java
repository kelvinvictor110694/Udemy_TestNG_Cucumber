package org.example;

import org.testng.annotations.DataProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Problems080924 {

    public static void main(String[] args) {
        reverseString();
        largestArray();
        largestElementArrayUsingStream();
        palindromes();
        factorialNo();
        fibonacci();
        removeJunkorSplChar();
        removeSpace();
        charOccurance();
        revereNo();
        noofDigits();
        evenAndOddDigits();
        sumofDigits();
    }

    public static void reverseString() {
        /*String a = "problem";
        String b = "";
        int length = a.length();
        for (int i = length - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        System.out.println(b);*/
        StringBuffer s = new StringBuffer("problem");
        System.out.println(s.reverse());

    }

    public static void largestArray() {
        int[] a = {3, 5, 6, 8, 12, 45, 58, 22};
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(a[length - 1]);
    }

    public static void largestElementArrayUsingStream() {
        int[] a = {3, 5, 6, 8, 12, 45, 58, 22};
        List<Integer> a1 = Arrays.stream(a).boxed().sorted().collect(Collectors.toList());
        int size = a1.size();
        System.out.println(a1.get(size - 1));
    }

    public static void palindromes() {
        String s = "malayalam";
        int length = s.length();
        String newvalue = "";
        for (int i = length - 1; i >= 0; i--) {
            newvalue = newvalue + s.charAt(i);
        }
        if (newvalue.equals(s))
            System.out.println("it is a palindrome");
        else
            System.out.println("not a palindrome");
    }

    public static void factorialNo() {
        int a = 3;
        for (int i =a-1;i>=1;i--){
            a = a*i;
        }
        System.out.println(a);
    }
    public static void fibonacci(){
        int total = 5;
        int a = 0;
        int b=1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i =0;i<=total;i++){
            c = b+a;
            System.out.println(c);
            a =b;
            b =c;
        }
    }
    public static void removeJunkorSplChar(){
        String s = "ảº?ç†3ä⅓éªŒÇ&* latin string 01234567890";
        String str = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);

    }
    public static void removeSpace(){
        String s = "Wel c o m  e";
        String s2 = "";
        String[] a = s.split(" ");
        for (int i =0; i<a.length;i++){
            s2 = s2 +a[i].trim();
        }
        System.out.println(s2);
    }
    public static void charOccurance(){
        String s = "welcome";
        int count =0;
        for (int i =0;i<s.length();i++){
            if (s.charAt(i)== 'e'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void revereNo(){
        int i = 5678;
        int revNo =0;
        while (i>0){
            revNo =  revNo*10 + (i%10);
            i = i/10;
        }
        System.out.println(revNo);
        String num = String.valueOf(i);
        StringBuffer sb = new StringBuffer(num);
        System.out.println(sb.reverse());
    }
    public static void noofDigits(){
        int num = 423768424;
        int count =0;
        while (num>0){
            num = num/10;
            count++;
        }
        System.out.println("no of digits are"+count);
    }
    public static void evenAndOddDigits(){
        int num = 423768424;
        int singledigit = 0;
        int even = 0;
        int odd =0;
        while (num>0){
            singledigit = num%10;
            num = num/10;
            if (singledigit%2 ==0)
               even++;
            else
                odd++;
        }
        System.out.println(even);
        System.out.println(odd);
    }
    public static void sumofDigits(){
        int num = 1234;
        int total =0;
        while (num>0){
            total = total+num%10;
            num = num/10;
        }
        System.out.println(total);
    }


}
