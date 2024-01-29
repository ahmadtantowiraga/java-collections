package com.enigma.java_collections;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleCollection {
    public static void main(String[] args) {
        Collection<String> names =new ArrayList<>();
        names.add("Cahyo");
        names.add("Theo");
        names.add("Rahmad");
        System.out.println(names);
        names.remove("Theo");
        System.out.println(names);
        System.out.println(names.contains("Cahyo"));
    }
}
