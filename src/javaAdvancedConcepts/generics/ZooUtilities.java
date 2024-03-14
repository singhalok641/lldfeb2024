package javaAdvancedConcepts.generics;

import interfaces.Animal;

import java.util.List;

public class ZooUtilities {
    public static void printAnimalNames(List<Animal> animals){
        for(Animal a: animals){
            System.out.println("Animal printed");
        }
    }

    public static void printAnimalName(Animal a){
        System.out.println("Animal printed");
    }
}
