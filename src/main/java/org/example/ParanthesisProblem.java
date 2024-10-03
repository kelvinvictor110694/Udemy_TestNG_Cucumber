package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ParanthesisProblem {

    public static void main(String[] args) {
        boolean value = balancedParanthesis();
        System.out.println(value);
        //uniquearraylsit();
    }
    public static boolean balancedParanthesis(){
        Scanner sc = new Scanner(System.in);
        String str =  sc.next();//"{([])}";

        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        for (int i =0; i<str.length();i++){
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[' ){
                stack.push(str.charAt(i));
                continue;
            }
            if (stack.isEmpty()){
                return false;
            }
            char check;
            switch (str.charAt(i)){
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;
            }

        }
        return stack.isEmpty();
    }

    public static void uniquearraylsit(){

        int [] a = {2,4,5,7,3,4,5,1,4};
        String[] name = {"kelvin"};
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        /*List<Integer> newlist = new ArrayList<Integer>();
        for (int i =0; i< list.size();i++){
            if (!newlist.contains(list.get(i))){
                newlist.add(list.get(i));
            }
        }*/
        List<Integer>newlist = list.stream().sorted().collect(Collectors.toList());
        System.out.println(newlist.toString());

    }
}
