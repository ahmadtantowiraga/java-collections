package com.enigma.java_collections;

public class exceptions {
    public static void main(String[] args) {
        try{
            try{
                System.out.println(5/0);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            int[] numbers =new int[3];
            System.out.println(numbers[3]);


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Program error: ");
            System.out.println(e);
            System.out.println("masukan vwvdw");
            System.out.println();
        }finally {
            System.out.println("selesai");
        }
        System.out.println("1");
    }
}
