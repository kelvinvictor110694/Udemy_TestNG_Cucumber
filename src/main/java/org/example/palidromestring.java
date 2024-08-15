package org.example;

public class palidromestring {
    public static void main(String[] args) {
        int x = 121;
        String original = String.valueOf(x);
        String reversed = new StringBuilder(original).reverse().toString();
        if (reversed.equals(original))
            System.out.println("it is a palindrome");
    }
}

