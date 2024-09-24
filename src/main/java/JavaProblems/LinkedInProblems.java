package JavaProblems;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class LinkedInProblems {
    public static void main(String[] args) {
        largestOf3Numbers();
    }

    public static void ReverseString() {
        String s = "welcome";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void largestNoArray() {
        int a[] = {3, 5, 90, 23, 56, 1};
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println((a[a.length - 1]));
    }

    public static void factorial() {
        int a = 5;
        for (int i = a - 1; i > 0; i--) {
            a = a * i;
        }
        System.out.println(a);
    }

    public static void fibonacciSeries() {
        int a = 5, num1 = 0, num2 = 1, total = 0;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 0; i < a - 2; i++) {
            total = num1 + num2;
            System.out.println(total);
            num1 = num2;
            num2 = total;
        }
    }

    public static void primeNumber() {
        int a = 89, count = 0;
        if (a < 1)
            System.out.println("not a prime no");
        for (int i = a; i > 0; i--) {
            if (a % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println("its a prime no");
        else
            System.out.println("not a prime no");
    }

    public static void anagram() {
        String s1 = "silents", s2 = "listens";
        char s1c[] = s1.toCharArray();
        char s2c[] = s2.toCharArray();
        Arrays.sort(s1c);
        Arrays.sort(s2c);
        if (Arrays.equals(s1c, s2c))
            System.out.println("its a anagram");
        else
            System.out.println("not a anagram");
    }

    public static void binarySearch() {
        int seachno = 57;
        int a[] = {3, 5, 90, 23, 56, 1};
        int low = 0;
        int high = a.length - 1;
        Arrays.sort(a);
        boolean flag = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == seachno) {
                System.out.println("element found");
                flag = true;
                break;
            }
            if (a[mid] > seachno) {
                high = mid - 1;
            }
            if (a[mid] < seachno) {
                low = mid + 1;
            }
        }
        if (flag == false)
            System.out.println("element not found");
    }

    public static void duplicateElementInArray() {
        int a[] = {3, 5, 90, 23, 56, 1, 3, 23};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }

    public static void matrixAddition() {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum = sum + a[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void stack() {
        Stack<Integer> s = new Stack<>();
        s.push(34);
        s.push(23);
        System.out.println(s);
        while (!s.empty()) {
            s.pop();
        }
        System.out.println(s);
    }

    public static void arithmeticException() {
        try {
            int a = 7 / 0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void firstAndLastOccurance(){
        String s = "amazonaanazzz";
        for (int i =0;i<s.length();i++){
            if (s.charAt(i) == 'a'){
                System.out.println(i);
                break;
            }
        }
        for (int i =s.length()-1;i>=0;i--){
            if (s.charAt(i) == 'a'){
                System.out.println(i);
                break;
            }
        }
    }
    public static void largestOf3Numbers(){
        int a = 10, b=30,  c =20,  max =0, maxest =0;
        max = (a>b) ? a : b;
        maxest = (max>c)? max : c;
        System.out.println(maxest);
    }

}
