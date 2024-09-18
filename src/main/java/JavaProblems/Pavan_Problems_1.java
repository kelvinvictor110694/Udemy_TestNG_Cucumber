package JavaProblems;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Pavan_Problems_1 {
    public static void main(String[] args) {
        evenOddPrint();
    }
    public static void swapTwoNosWithoutTemp(){
        int a = 10, b = 20;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);

    }
    public static void swapTwoNos(){
        int a = 10, b = 20, temp =0;
        temp =b;
        b =a;
        a = temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void reverseNo(){
        int a = 139;
        int reverseno =0;
        while (a>0){
            reverseno = reverseno*10 + a%10;
            a = a/10;
        }
        System.out.println(reverseno);
    }
    public static void reverseString(){
        String s  = "Welcome";
        String reverse ="";
        for (int i = s.length()-1; i>=0;i--){
            reverse = reverse+s.charAt(i);
        }
        System.out.println(reverse);
    }
    public static void palindrome(){
        String s = "madama";
        String reverse ="";
        for (int i = s.length()-1; i>=0;i--){
            reverse = reverse+s.charAt(i);
        }
        if (reverse.equals(s))
            System.out.println("it is a palindrome");
        else
            System.out.println("it is not a palindrome");
    }
    public static void noOfDigits(){
        int a = 97928306;
        int count = 0;
        while (a>0){
            a = a/10;
            count++;
        }
        System.out.println(count);
    }
    public static void evenOdd(){
        int a =97928306, reminder =0 ,even =0, odd=0;
        while (a>0){
            reminder = a%10;
            a= a/10;
            if (reminder %2 ==0)
                even++;
            else
                odd++;

        }
        System.out.println(even);
        System.out.println(odd);
    }
    public static void sumOfDigits(){
        int  a = 979283306, sum =0;
        while (a>0){
            sum =sum+ (a%10);
            a =a/10;
        }
        System.out.println(sum);
    }
    public static void largestof3Nos(){
        int a =50,b=70,c=30,large =0,largest =0;
        large = (a>b) ? a : b;
        largest = (large>c) ? large : c;
        System.out.println(largest);
    }
    public static void fibonacciSeries(){
        int noOfDigits =10,a =0,b =1,total=0;
        System.out.println(a);
        System.out.println(b);
        for (int i =2; i<=noOfDigits;i++){
            total= a+b;
            a=b;
            b=total;
            System.out.println(total);
        }
    }
    public static void primeNo(){
        int a =6,count = 0;
        if (a<1){
            System.out.println("not a prime no");
        }
        for (int i=1;i<=a;i++){
            if (a%i ==0){
                count++;
            }
        }
        if (count ==2){
            System.out.println("its a prime no");
        }
        else
            System.out.println("not a prime no");
    }
    public static void RandomValues(){
        Random random = new Random();
        System.out.println(random.nextInt(100));
    }
    public static void randomByApache(){
        String random =RandomStringUtils.randomAlphabetic(5);
        System.out.println(random);
    }
    public static void factorial(){
        int a =5;
        for (int i=a-1; i>0;i--){
            a = a*i;
        }
        System.out.println(a);
    }
    public static void sumOfArray(){
        int a[] = {3,5,63,4,66};
        int sum =0;
        for (int i =0;i<a.length;i++){
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
    public static void evenOddPrint(){
        int a[] = {3,5,63,4,66};
        for (int i=0; i<a.length;i++){
            if (a[i]%2 == 0)
                System.out.println(a[i]+" is a even no");
            else
                System.out.println(a[i]+" is a odd no");

        }
    }
}
