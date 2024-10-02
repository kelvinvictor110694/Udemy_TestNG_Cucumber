package org.example;

import java.util.Arrays;

public class examples {

    public static void main(String[] args) {
        String s ="anagram";
                String t="nagaram";
        boolean flag =false;
        char s1[] = new char[s.length()];
        char t1[] = new char[t.length()];
        for(int i =0; i<s.length();i++){
            s1[i] = s.charAt(i);
        }
        for(int j =0; j<s.length();j++){
            t1[j] = t.charAt(j);
        }
        Arrays.sort(s1);
        Arrays.sort(t1);
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(t1));

        if(Arrays.equals(s1,t1))
            flag = true;

        System.out.println(flag);
    }
}


