package interfaces;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void bark(){
        System.out.println("Bhow Bhow!");
    }
}
