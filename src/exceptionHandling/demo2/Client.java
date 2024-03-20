package exceptionHandling.demo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Hello");
            System.out.println("shello");

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            System.out.println("bye");
            System.out.println("shye");
            System.out.println(n);
        }
        catch (InputMismatchException inputMismatchException){
            // log the exception
            System.out.println("A bug occurred. It is logged in a file.");
        }

        System.out.println("Program has not crashed that is why we are " +
                "executing this statement");
    }
}
