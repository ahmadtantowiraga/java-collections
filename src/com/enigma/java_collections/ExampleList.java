package com.enigma.java_collections;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Budi");
        names.add("Cahyo");
        names.add("Adil");
        names.add("alvindo");
        names.add("Theo");


        System.out.println(names);
        System.out.println(names.get(1));
        names.set(0,"Rahman");
        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
            System.out.println();

            System.out.println("For each ");
        }
        for (String i :names){
            System.out.println(i);
        }

    }
}
