package lambdas;

import collection.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ---- v1
        SomethingDoer somethingDoer = new SomethingDoer();
//        Runnable runnable = new SomethingDoer();
        Thread t = new Thread(somethingDoer);
        t.start();

        // ---- v2 using lambda expression/arrow functions
        Runnable r = () -> {
            // run() method's body
            System.out.println("Do something v2");
        };

        Thread t2 = new Thread(r);
        t2.start();

        // ---- v3

        Thread t3 = new Thread(
                () -> {
                    System.out.println("Do something v3");
                }
        );

        t3.start();


        // Sort students using the collections.sort(student);
        List<Student> students = new ArrayList<>();
        students.addAll(
                List.of(
                        new Student(1, "Alok", 20, 90),
                        new Student(2, "Sofia", 25, 99),
                        new Student(3, "Upendra", 23, 99.99),
                        new Student(1, "Abhishek", 21, 80)
                )
        );

//        Comparator<Student> studentComparator = (o1, o2) -> {
//            if(o1.getName().equals(o2.getName())){
//                return 0;
//            }
//            if(o1.getName().compareTo(o2.getName()) < 0){
//                return -1;
//            }
//            return 1;
//        };

        Collections.sort(students,
                (o1, o2) -> {
                    if(o1.getName().equals(o2.getName())){
                        return 0;
                    }
                    if(o1.getName().compareTo(o2.getName()) < 0){
                        return -1;
                    }
                    return 1;
                }
        );

    }
}
