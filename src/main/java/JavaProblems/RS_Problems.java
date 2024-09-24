package JavaProblems;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Collectors;

public class RS_Problems {
    public static void main(String[] args) {
        uniqueNosinArray();
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
}
