package exceptionHandling.demo4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnExampleOfCheckedException {
    public static void main(String[] args) {
        String fileName = "abc.txt";
        try {
            fun(fileName);
        } catch (Exception e) {
            System.out.println();
        }
    }

    static void fun(String fileName) throws IOException {
        File f = new File(fileName);
        FileReader fr = null;


        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            System.out.println("File: " + fileName + " is not present");
        }
        fr.read();
    }
}
