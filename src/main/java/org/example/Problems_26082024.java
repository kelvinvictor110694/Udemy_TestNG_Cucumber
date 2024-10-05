package org.example;

public class Problems_26082024 {

    public static void main(String[] args) {
        reverseString();
        palindrome();
        fibonacci();
        factorial();
        primeNumber();
        primeNumbervalues();
    }

    public static void reverseString() {
        String str = "Automation";
        String reversestr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversestr = reversestr + str.charAt(i);
        }
        System.out.println(reversestr);
    }

    public static void palindrome() {
        String str = "madam";
        String reversestr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversestr = reversestr + str.charAt(i);
            if (str.equals(reversestr)) {
                System.out.println(true);
            }
        }
    }

    public static void fibonacci(){
        int num1 =0;
        int num2 =1;
        System.out.print(num1+","+num2);
        for (int i =0; i<10; i++) {
            int num3 = num1 + num2;
            System.out.print(","+num3);
            num1 = num2;
            num2=num3;

        }
    }

    public static void factorial(){
        int a = 3;
        for (int i =a-1;i>0;i--){
            a = a*i;
        }
        System.out.println("");
        System.out.println(a);
    }

    public static void primeNumber(){
        int primenumber = 16;
        int count =0;

        if (primenumber >=1){
            for (int i =1;i<=primenumber;i++){
                if (primenumber%i == 0){
                    count++;
                }
            }
            if (count ==2)
            System.out.println("Prime number");
            else
                System.out.println("not a prime number");

        }
        else {
            System.out.println("Not a prime no");
        }
    }

    public static void primeNumbervalues(){
        System.out.println("*************");
        int primenumber = 4;
        int count =0;

        for (int i =1;i<=primenumber;i++){
            if (primenumber % i == 0){
                count++;
                continue;
            }


        }
        if (count == 2){
            System.out.println();
        }

    }
}


