package constructorChaining;

public class B extends A{
    int age;
    B(){
        System.out.println("Constructor of B");
    }

    B(int val){
        this.age = val;
        System.out.println();
    }
}
