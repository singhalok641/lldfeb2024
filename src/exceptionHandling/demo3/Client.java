package exceptionHandling.demo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        // DatabaseConnection db = new DatabaseConnection("", user, pass);
        // db.getUser();



        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Hello");
            System.out.println("shello");

            int n = in.nextInt();
            if(n == 10) return;

            System.out.println("bye");
            System.out.println("shye");
            System.out.println(n);
        }
        catch (InputMismatchException inputMismatchException){
            // log the exception
            System.out.println("A bug occurred. It is logged in a file.");
        }
        finally {
            System.out.println("Inside finally block. Testing something");
            in.close();
            // close the files, ports, database connections
        }

        System.out.println("Program has not crashed that is why we are " +
                "executing this statement");
    }
}
