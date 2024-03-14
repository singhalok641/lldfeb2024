package javaAdvancedConcepts.generics;

import accessModifiers.Student;
import interfaces.Animal;
import interfaces.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Object obj = new Student();
        Pair p = new Pair("Alok", 1);

        // Not compile time safe
//        String s1 = (String)p.getFirst();
//        String s2 = (String)p.getSecond();

//        System.out.println(s1);
//        System.out.println(s2);

        // Compile time safe solution
        GenericPair<Integer, String> genericPair = new GenericPair<>(1, "Alok");
        Integer s3 = genericPair.getFirst();
        String s4 = genericPair.getSecond();

        GenericPair<String, String> genericPair1 = new GenericPair<>("Alok", "TU");

        GenericPair genericPair2 = new GenericPair("Alok", "Lokesh");


//        System.out.println(s3);
//        System.out.println(s4);

        HashMap map = new HashMap();
        map.put(1, "Abhishek");
        map.put("Alok", "Alok");

//        for(var v: map.keySet()){
//            int i = (Integer)v;
//            System.out.println(i);
//        }

        List list = new ArrayList();
        list.add(1);
        list.add("Alok");
        list.add(new Pair("Alok", "Ankur"));

        List<Integer> list1 = List.of(1, 2);
        List<String> list2 = List.of("Alok", "abhi");

        System.out.println(Utilities.doSomething(1, "Alok"));
        System.out.println(Utilities.doSomething("Lokesh", 2));


        List<Dog> dogs = new ArrayList<>();
//        ZooUtilities.printAnimalNames(dogs); - Error because List<Animal> is not parent of List<Dog>

        Dog dog = new Dog();
        ZooUtilities.printAnimalName(dog); // Correct because Animal is parent of Dog
        Animal a = new Dog();

//        List<Animal> animals = dogs;
//
//        List<String> s = new ArrayList<>();
//
//        List<Integer> integers = s;

    }
}
