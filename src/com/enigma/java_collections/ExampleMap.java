package com.enigma.java_collections;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
        Map<String, String> countries=new HashMap<>();
        countries.put("Indonesia","Jakarta");
        countries.put("Malaysia","Kuala");
        countries.put("Vietnam","Hanoy");

        System.out.println(countries);

        for (Map.Entry<String, String> data : countries.entrySet()){
            System.out.println("Key : "+data.getKey());
            System.out.println("Value : "+data.getValue());
        }
    }
}
