package org.example;

public class Printinitialsname {
    public static void main(String[] args) {
        String name = "kelvin victor Rosanna Joy";

        System.out.println(name.charAt(0));

        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                System.out.println(name.charAt(i + 1));
            }
        }
    }
}
