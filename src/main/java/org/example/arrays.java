package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrays {
    public static void main(String[] args) {
        /*ArrayList<String> a = new ArrayList<String>();
        String[] name ={"kelvin","victor"};
        List<String> b= Arrays.asList(name);
        b.contains("victor");*/
        arrays array = new arrays();
        array.split();

    }

    public void split(){
        String value = "kelvin 'victor' is";
        String[] splitvalue = value.split("'");
        for (int i =0; i<splitvalue.length;i++) {
            System.out.println(splitvalue[i]);
        }
        String finals = splitvalue[1];
        System.out.println(finals);
    }
}

