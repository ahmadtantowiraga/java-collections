package com.enigma.java_collections;

import java.util.ArrayList;
import  java.util.Arrays;
import java.util.Iterator;

public class ExampleIterable {
    public static void main(String[] args) {
        Iterable<String> names =new ArrayList<>(Arrays.asList("Cahyo", "Theo", "Rahman", "Alvindo", "Dzaki"));
        Iterator<String> iterator=names.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("Alvindo")){
                iterator.remove();
            }
        }
        for (String name : names){
            System.out.println(name);
        }

    }
}
