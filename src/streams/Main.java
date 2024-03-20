package streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = List.of(
                1,2,3,4
        );

        Stream<Integer> s1 = li.stream();

//        s1.forEach(
//                (elem) -> {
//                    System.out.println(elem * 2);
//                }
//         );


//        class MyConsumer implements Consumer<Integer>{
//            @Override
//            public void accept(Integer elem) {
//                System.out.println(elem * 2);
//            }
//        }
//
//        MyConsumer c1 = new MyConsumer();
//        for(Integer i: li){
//            c1.accept(i);
//        }

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Stream<Integer> setStream = set1.stream();

        Set<Integer> newSet = new HashSet<>();

        setStream.forEach(
                (elem) -> {
                    newSet.add(elem);
                }
        );

        List<Integer> l1 = List.of(
                1,2,3,4,5,6
        );


        // .filter() is an intermediate method
        l1.stream()
                .filter((elem) -> elem % 2 == 0)
                .filter((elem) -> elem >= 4)
                .forEach(
                        (elem) -> System.out.println(elem * 2)
                );

        System.out.println(l1);


        // map method in Streams
        l1.stream()
                .map((elem) -> elem * 3) // {1, 2, 3, 4, 5, 6}
                .filter((elem) -> elem < 10) // {3, 6, 9, 12, 15, 18}
                .forEach((elem) -> System.out.println(elem)); // {3, 6, 9}

        List<Integer> numbersMultiplyBy3 = new ArrayList<>();
        for(Integer i: l1){
            numbersMultiplyBy3.add(i * 3);
        }

        System.out.println("============== Answer =============");
        List<Integer> numberLessThan10 = new ArrayList<>();
        for(Integer i: numbersMultiplyBy3){
            if(i < 10){
                numberLessThan10.add(i);
            }
        }

        System.out.println(numberLessThan10.get(0));

        Optional<Integer> i = l1.stream()
                .map((elem) -> elem * 3) // {1, 2, 3, 4, 5, 6}
                .filter((elem) -> elem < 10) // {3, 6, 9, 12, 15, 18}
                .findFirst();

        if(i.isPresent()){
            System.out.println(i.get());
        }

    }
}
