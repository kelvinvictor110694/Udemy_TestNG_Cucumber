package org.example;

public class Plusone {


    public static void main(String[] args) {
        int[] input = {4, 3, 2, 9};
        int num;
        for (num = input.length - 1; num >= 0; num--) {
            if (input[num] < 9) {
                ++input[num];
                System.out.println(input[num]);
            }
            input[num]=0;
        }

        int[] ans = new int[input.length + 1];
        ans[0] = 1;
        //System.out.println(ans);

    }
}
