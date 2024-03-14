package javaAdvancedConcepts.generics;

public class Utilities {

    public static <K,V> V doSomething(K key, V value){ // K will be Integer, V => String
        System.out.println(key);
        System.out.println(value);

        return value;
    }

}
