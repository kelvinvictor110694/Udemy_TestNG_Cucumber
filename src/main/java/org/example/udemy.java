package org.example;

public class udemy {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);


        int[] revarr = new int[numbers.length];
        for (int i =0;i<numbers.length;i++) {
            revarr[i] = numbers[numbers.length - i - 1];
            System.out.println(revarr[i]);
        }
        int length = numbers.length;
        System.out.println(length);
    }
}
