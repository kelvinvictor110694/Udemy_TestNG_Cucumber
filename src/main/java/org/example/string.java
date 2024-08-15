package org.example;

public class string {

    public static void main(String[] args) {
        printStringvalue();
        reverseStringexceptsecondchar();
    }

    public static void printStringvalue() {
        String s = "kelvin victor";
        String[] splitvalue = s.split(" ");
        for (int i = 0; i < splitvalue.length; i++) {
            System.out.println(splitvalue[i]);
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }

    public static void reverseStringexceptsecondchar(){
        String s = "Independence";
        String reverse="";
        reverse = reverse+s.charAt(s.length()-1);
        for (int i=s.length()-3; i>=1 ;i--){
            reverse = reverse + s.charAt(i);
        }
        reverse = reverse+s.charAt(s.length()-2)+s.charAt(0);
        System.out.println(reverse);
    }
}
