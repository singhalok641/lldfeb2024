package interfaces;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

//    public void meow(){
//        System.out.println("Meow!!!!");
//    }
}
