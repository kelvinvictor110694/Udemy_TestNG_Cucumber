package JavaProblems;

import java.util.*;
import java.util.stream.Collectors;

public class Pavan_Problems_2 {
    public static void main(String[] args) {
        reverseEachWordInString();
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
        int a[] = {99,3,5,3,63,66,4,66};
        for (int i = 0; i<a.length-1;i++){
            for (int j = i+1;j<a.length;j++){
                if (a[i] == a[j])
                    System.out.println(a[i]);
            }
        }
    }
    public static void removeJunkSplchar(){
        String s = "qpweibgfoiwq740tyq9ty4q!@#$Y*&(^%&0y0udsgabdigb";
        System.out.println(s.replaceAll("[^a-zA-Z]",""));
    }
    public static void removeWhiteSpace(){
        String s = "Java     Programming     Selenium     Automation";
        System.out.println(s.replaceAll(" ",""));
    }
    public static void occuranceOfChar(){
        String s = "Java Programming Java Oops";
        int count = 0;
        for (int i =0;i<s.length();i++){
            if (s.charAt(i)=='a')
                count++;
        }
        System.out.println(count);
    }
    public static void wordsInAString(){
        String s = "Java Programming Java Oops";
        String[] s1 = s.split(" ");
        System.out.println(s1.length);
    }
    public static void reverseEachWordInString() {
        String s = "Java Programming Java Oops";
        String reverse = "";
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            for (int j = s1[i].length()-1; j >= 0; j--) {
                reverse = reverse + s1[i].charAt(j);
            }
            reverse = reverse + " ";
        }
        System.out.println(reverse);
    }
}
