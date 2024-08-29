package org.example;

public class ParanthesisProblem {

    public static void main(String[] args) {
        String str = "{([])}";
        int length = str.length();

        for (int i =0; i<(length/2)-1;i++){
            for (int j=length-1;j>=length/2;j--){
                System.out.println("str i"+str.charAt(i));
                System.out.println("str j"+str.charAt(j));

                if (str.charAt(i) == str.charAt(j)){
                    System.out.println("valid paranthesis");
                }
            }
        }
    }
}
