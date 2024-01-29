package com.enigma.java_collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ExampleSet {
    public static void main(String[] args) {
        Hero ahmad=new Hero("ahmad");
        Hero ahmad1=new Hero("ahmad1");
        Hero ahmad2=new Hero("ahmad2");


        Set<Hero> heroes=new HashSet<>();
        heroes.add(ahmad);
        heroes.add(ahmad1);
        heroes.add(ahmad2);
        System.out.println(heroes);
    }

    public static class Hero{
        private  String name;
        public Hero(String name){
            this.name=name;
        }

        @Override
        public String toString() {
            return "Hero{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Hero hero = (Hero) o;
            return Objects.equals(name, hero.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
