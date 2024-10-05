package org.example;

public class string {

    public static void main(String[] args) {
        printStringvalue();
        reverseStringexceptsecondchar();
        replaceStringwithDollar();
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
        String s = "Independance";
        String reverse="";
        reverse = reverse+s.charAt(s.length()-1);
        for (int i=s.length()-3; i>=1 ;i--){
            reverse = reverse + s.charAt(i);
        }
        reverse = reverse+s.charAt(s.length()-2)+s.charAt(0);
        System.out.println(reverse);
    }

    public static void replaceStringwithDollar() {
        String s = "Go to Joho";
        String remove = "o";
        String replace = "$";
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.toString(s.charAt(i)).equals(remove)) {
                count++;
                for (int j = 0; j < count; j++) {
                    sb.append(replace);
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
