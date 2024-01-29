package com.enigma.java_collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<String> names=List.of("Agysn", "cahyo","Theo");
    public static void main(String[] args) {
//        try{
//            int[] numbers =new int[3];
//            System.out.println(numbers[1]);
//            System.out.println(numbers[3]);
//            System.out.println(numbers[2]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Program error: ");
//            System.out.println(e);
//            System.out.println("masukan vwvdw");
//            System.out.println();
//        }
//        System.out.println("1");

//        Main main=new Main();
//        try {
//            main.searchByName("udin");
//        }catch (NotFoundException e){
//            e.printStackTrace();
//        }
        try{
            nyoba();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("udah");


   }
    public static void nyoba(){
        int[] a={1,2,3,4};
        System.out.println(a[4]);
    }
   public List<String> searchByName(String name) throws NotFoundException {
        List<String> result =new ArrayList<>();
        for (String s: names){
            if (s.equals(name)){
                result.add(s);
            }
        }
        if (result.isEmpty()){
            throw new NotFoundException(("Nama tidsk ada"));
        }else{
            return result;
        }
   }
}
