package org.example;

public class string {

    public static void main(String[] args) {
        String s = "kelvin victor";
        String[] splitvalue = s.split(" ");
        for (int i=0;i<splitvalue.length;i++){
            System.out.println(splitvalue[i]);
        }
        for (int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }
    }
}
