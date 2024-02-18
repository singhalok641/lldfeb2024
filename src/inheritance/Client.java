package inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.username = "Alok";
        instructor.login();
        instructor.avgRating = 4.5;
        instructor.scheduleClass();

        System.out.println("DEBUG");
    }
}
