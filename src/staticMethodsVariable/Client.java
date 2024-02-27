package staticMethodsVariable;

public class Client {
    public static void main(String[] args) {
//        System.out.println(Student.univName);

        Student st = new Student();
//        System.out.println(st.getStudentAge());

        System.out.println(Student.getStudentUnivName());

        System.out.println(st.getStudentUnivName());

        System.out.println(Roles.instructor);

//        Student.get

    }
}
