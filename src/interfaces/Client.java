package interfaces;

import polymorphism.C;

import java.util.Random;
import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        // Coding to an implementation
//        Cat cat = new Cat();
//        Dog dog  = new Dog();


        // YesBankApi api = new YesBankApi(); - 1 // tighly coupled
        // BankApi api = new YesBankApi(); - 2 // loosely coupled

        // Cat cat = new Cat(); - tightly coupled - coding to an implementation
        // Animal cat = new Cat(); - loosely coupled - coding to an interface

        // Coding to an interface
        Animal cat = new Cat();

        Animal dog = new Dog();

        Cat cat1 = new Cat();



        cat.sleep();
        cat.walk();

        dog.walk();


        Animal animal = getAnimal();



    }

    private static Animal getAnimal() {
        Random random = new Random(10);

        if(random.nextInt() %2 == 0){
            return new Dog();
        }

        return new Cat();
    }


}
