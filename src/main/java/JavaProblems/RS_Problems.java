package JavaProblems;


import java.text.SimpleDateFormat;
import java.util.*;

public class RS_Problems {
    public static void main(String[] args) {
        longestConsecutiveNo();
    }

    public static void statirCaseToptoBottom(){
        int count = 0;
        for (int i=4;i>0;i--){
            for (int j =1;j<=i;j++){
                System.out.print(++count);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void statirCaseBottomtoTop(){
        int count =0;
        for (int i =1; i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(++count);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void multiDimentionArray(){
        int a [][] = {{4,5,6},{7,8,9}};
        for (int i =0; i<2;i++){
            for (int j=0;j<3;j++){
                System.out.println(a[i][j]);
            }
        }
    }
    public static void minNoinaMatrix(){
        int a [][] = {{4,5,6},{7,8,9},{2,4,12}};
        int min = a[0][0];
        for (int i =0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (a[i][j]<min){
                    min = a[i][j];
                }
            }
        }
        System.out.println(min);
    }
    public static void minAndMaxinMatrix(){
        int a [][] = {{4,5,1},{7,8,9},{2,4,12}};
        int min = a[0][0], max = 0, column =0;
        for (int i =0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (a[i][j]<min){
                    min = a[i][j];
                    column =j;
                }
            }
        }
        int k =0;
        while (k<a.length){
            if (a[k][column]>max){
                max = a[k][column];
            }
            k++;
        }
        System.out.println(min+"-"+column);
        System.out.println(max);
    }
    public static void date(){
        Date date = new Date();
        //System.out.println(date.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        System.out.println(sdf.format(date));
    }
    public static void uniqueNosinArray(){
        int a[] ={4,5,5,5,4,6,6,9,4};
        ArrayList<Integer> li = new ArrayList<>();
        for (int i =0;i<a.length;i++){
            int k =0;
            if (!li.contains(a[i])) {
                li.add(a[i]);
                for (int j=0;j<a.length;j++){
                    if (a[i] == a[j])
                        k++;
                }
                System.out.println(a[i]+" "+k);
            }
        }
        System.out.println(li);
    }
    public static void printWithoutLoop(int num){
        if (num<=10){
            System.out.println(num);
            num++;
            printWithoutLoop(num);
        }
    }
    public static void printA2B3C4(){
        String s = "a2b3c4";
        int a =0;
        for (int i=0;i<s.length();i++) {
            if (Character.isAlphabetic(s.charAt(i))){
                System.out.print(s.charAt(i));
            }
            else {
                a = Character.getNumericValue(s.charAt(i));
                for (int j = 1; j < a; j++) {
                    System.out.print(s.charAt(i - 1));
                }
            }
        }
    }
    public static void hashmaptoArray(){
        HashMap<String,String> hm = new HashMap<>();
        hm.put("India","New Delhi");
        hm.put("France","Paris");
        hm.put("Germany","Berlin");

        List<String> l1 = new ArrayList<>(hm.keySet());
        System.out.println(l1);
        /*for (int i =0;i< l1.size();i++){
            System.out.println(l1.get(i));
        }*/
        List<String> l2 = new ArrayList<>(hm.values());
        System.out.println(l2);
        /*for (int i =0;i< l2.size();i++) {
            System.out.println(l2.get(i));
        }*/


    }
    public static void reverseArray(){
        char[] s={'a','b','c','d','e'};
        List<Character> c = new ArrayList<>();
        for (int i =s.length-1;i>=0;i--){
            c.add(s[i]);
        }
        System.out.println(c);
    }
    public static void reverseArrayWithoutTemp(){
        char[] s={'a','b','c','d','e'};
        char temp;
        for (int i =0; i<s.length/2;i++){
            temp = s[s.length-1-i];
            s[s.length-1-i]= s[0+i];
            s[0+i] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
    public static void swapString(){
        String s1 ="kelvin", s2 ="victor", temp = null;
        temp = s1;
        s1 = s2;
        s2 =temp;
        System.out.println(s1+" "+s2);
    }
    public static void capitalLetters(){
        String s ="RahulShettyAcademy";
        int count =0;
        for (int i =0;i<s.length();i++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void longestConsecutiveNo(){
        int a[] ={4,3,25,6,7,8,9,10,2,3,10};
        int count =0;
        int max =0;
        for (int i =0; i<a.length-1;i++){
            if (a[i]+1 == a[i+1]){
                count++;
            }
            else {
                count=0;
            }
             max = Math.max(max,count+1);
        }
        System.out.println(max);
    }
}
