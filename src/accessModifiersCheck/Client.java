package accessModifiersCheck;

import accessModifiers.Student;

public class Client extends Student{
    public static void main(String[] args) {
        Student student = new Student();
        // Errors as private, protected, default are not
        //accessible from this class
        // Because this class is present in a different package
//        student.name = "Alok";
//        student.psp = 91.0;
//        student.batchId = 123;
        student.univName = "SST";

        StudentChild studentChild = new StudentChild();

        System.out.println("DEBUG");

    }

}
