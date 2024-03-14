package collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(2);
        List<Integer> linkedList = new LinkedList<>();


        Stack<Integer> stack = new Stack<>();
        Vector<Integer> stack1 = new Stack<>();
        List<Integer> stack2 = new Stack<>();


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1); // 1
        linkedHashSet.add(21); // 1 <-> 21
        linkedHashSet.add(10); // 1 <-> 21 <-> 10
        linkedHashSet.remove(1); // 21 <-> 10
        linkedHashSet.add(50); // 21 <-> 10 <-> 50
        linkedHashSet.add(1); // 21 <-> 10 <-> 50 <-> 1

        for(Integer i: linkedHashSet) {
            System.out.println(i);
        }

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();

        // EnumSet

        Payment payment = new Payment();
        payment.paymentStatus = PaymentStatus.SUCCESS;

        // Question:  For every possible status of payment,
        // tell me what all payments have that particular status

        // FAILED: pay1, pay2, pay3
        // SUCCESS: pay4, pay5
        // for each paymentStatus:
        //     for each payment:
        //         if(payment.status == paymentStatus):
        //                 print (paymentStatus:  payment)

        List<Payment> payments = new ArrayList<>();

        Set<PaymentStatus> enumSet = EnumSet.allOf(PaymentStatus.class);

        Queue<Integer> priorityQueue = new PriorityQueue<>();



        List<Student> students = new ArrayList<>();
        students.addAll(
                List.of(
                        new Student(1, "Alok", 20, 90),
                        new Student(2, "Sofia", 25, 99),
                        new Student(3, "Upendra", 23, 99.99),
                        new Student(1, "Abhishek", 21, 80)
                )
        );

        Collections.sort(students);

        System.out.println(students);

        Collections.sort(students, new StudentComparatorByName());


        System.out.println("DEBUG");

    }

}
