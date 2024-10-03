package JavaProblems;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedInProblems {
    public static void main(String[] args) {
        luckyInteger();
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
    public static void wordsInAString(){
        String s = "Welcome Java to Java";
        String s1[] = s.split(" ");
        int count =0;
        List<String> li = Arrays.asList(s1);
        for (String s2:li){
            if (s2.equalsIgnoreCase("Java")){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void treemapPblm(){
        TreeMap<Integer,String> tm =  new TreeMap<Integer,String>();
        tm.put(100,"kelvin");
        tm.put(200,"victor");
            System.out.println(tm.values());
    }
    public static void perfectNo(){
        int no =6,i=1, sum =0;
        while (i<no){
            if (no%i ==0) {
                sum = sum + i;
            }
                i++;
        }
        if (no == sum)
            System.out.println("it is a perfect no");
        else
            System.out.println("not a perfect no");
    }
    public static void additionWOOperator(){
        int a = 20,b=30,sum =0;
        sum = a- ~b -1;
        System.out.println(sum);
    }
    public static void occuranceOfInt(){
        int a[] ={1,2,8,3,2,2,2,5,1};
        List<Integer> li = new ArrayList<>();
        for (int i =0; i<a.length;i++){
            int k =1;
            if (!li.contains(a[i])){
                li.add(a[i]);
                for (int j = i+1;j<a.length;j++){
                    if (a[i]==a[j])
                       k++;
                }
                System.out.println(a[i]+" "+k);
            }
        }
    }
    public static void printDuplicateElements(){
        int a[] ={1,2,8,3,2,5,1};
        for (int i =0; i<a.length-1;i++){
            for (int j = i+1;j<a.length;j++) {
                if (a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
    public static void stringRepetative(){
        String s ="Attribute";
        String s1 = s.toLowerCase();
        char c[] = s1.toCharArray();
        List li = new ArrayList();
        for (int i =0; i<c.length-1;i++){
            int count =0;
            if (!li.contains(c[i])) {
                li.add(c[i]);
                for (int j = i + 1; j < c.length; j++) {
                    if (c[i] == c[j]) {
                        count++;
                        //System.out.println(c[i]);
                    }

                }
            }
            if (count>=1){
                System.out.println(c[i]);
            }
        }
    }
    public static void longestCommonPrefix(){
        String[] strs = { "geeksforgeeks", "geeks", "geek","geezer" };
        Arrays.sort(strs);
        String str1 = strs[0], str2 = strs[strs.length-1];
        int count =0;
        for (int i =0;i<str1.length();i++){
            if (str1.charAt(i) == str2.charAt(i)){
                count++;
            }
        }
        System.out.println(str1.substring(0,count));

    }
    public static void mergerTwoArrays(){
        int a[] = {1,2};
        int b[] = {3,4};
        int c [] = new int[a.length+b.length];
        for (int i =0;i<a.length;i++){
            c[i]=a[i];
        }
        for (int j=0;j<b.length;j++){
            c[a.length+j] = b[j];
        }
        System.out.println(Arrays.toString(c));
    }
    public static void primeNumbersBetween(){
        int num = 30;
        for (int i =1;i<=num;i++){
            int count =0;
            for (int j=1;j<=i;j++){
                if (i%j == 0){
                  count++;
                }
            }
            if (count == 2){
                System.out.println(i);
            }
        }
    }
    public static void subarraySum(){
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10; //,result =0;
        int count =0;
        for (int i =0;i<arr.length-1;i++){
            int sum =0;
            sum = sum + arr[i];
            for (int j =i+1;j<arr.length;j++){
                sum = sum +arr[j];
                if (sum == k){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
    public static void rotateArray(){
        int arr[] ={1, 2, 3, 4, 5, 6, 7};
        int d =2; //index from which it must be rotated
        int temp[] = new int[arr.length];
        int k =0;
        for (int i =d;i<arr.length;i++){
            temp[k]= arr[i];
            k++;
        }
        for (int i =0;i<d;i++){
            temp[k]= arr[i];
            k++;
        }

        System.out.println(Arrays.toString(temp));
    }
    public static void rotateArrayWithoutTemp(){
        int arr[] = {1,2,3,4,5,6,7};
        int d =2;
        int temp =0;
        for (int i=0; i<d; i++){
            for (int j=arr.length-2; j>=0;j--){
                temp = arr[arr.length-1];
                arr[j+1] = arr[j];
            }
            arr[0] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void findingSortedArray(){
        int a[] = {1,3,4,5,10,20};
        int count =0;
        for (int i =0;i<a.length-1;i++){
            if (a[i]<a[i+1])
                count++;
        }
        if (count == a.length-1)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }
    public static void countOccurance(){
        int a[] = {3, 7, 2, 8, 7, 3, 1, 2};
        List li = new ArrayList<>();
        for (int i =0;i<a.length;i++) {
            if (!li.contains(a[i])) {
                li.add(a[i]);
                int count = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                    }
                }
                System.out.println(a[i] + " " + count);
            }
        }
    }
    public static void moveRepeatingElementsToEnd(){
        int a[] = {5, 2, 7, 6, 1, 1, 5, 6, 2};
        int temp = -1;
        Arrays.sort(a);  //[1,1,2,2,5,5,6,6,7]
        for (int i =0;i<a.length-1;i++){
            if (a[i]==a[i+1]){
                temp = a[i+1];
                for (int j =i+1;j<a.length-1;j++){
                    a[j]=a[j+1];
                }
                a[a.length-1] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void moveNegativeNosToStart(){
        int a[] ={1, 2, -3, 4, -4, -5};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void luckyInteger(){
        int[] a ={2,2,3,3,3,4};
        List li = new ArrayList<>();
        for (int i =0;i<a.length;i++){
            int count =1;
            if (!li.contains(a[i])){
                li.add(a[i]);
                for (int j =i+1;j<a.length;j++){
                    if (a[i] == a[j])
                        count++;
                }
                if (count == a[i])
                    System.out.println(a[i]+" is a lucky no");
            }
        }
    }
}
