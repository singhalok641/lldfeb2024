package polymorphism;

import java.util.Random;

public class Client {

    private static A getObject(){
        Random random = new Random(10);
        if(random.nextInt() % 2 == 0){
            return new B();
        }

        return new C();
    }

    public static void main(String[] args) {
        A a = getObject();
//        a. = "Google";

    }
}
