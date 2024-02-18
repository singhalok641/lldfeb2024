package accessModifiers;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Alok";  ERROR. name is a private attribute
        student.batchId = 123;
        student.psp = 91.0;
        student.univName = "Scaler School of Technology";
    }
}
