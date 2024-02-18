public class Student {
    int age;
    String name;

    void display(){
        System.out.println("My name is " + name + ". I am "  + age + " years old");
    }

    void sayHello(String newName){
        System.out.println(name + " says hello to " + newName);
    }
}
