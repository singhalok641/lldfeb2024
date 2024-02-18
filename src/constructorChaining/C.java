package constructorChaining;

public class C extends B{
    C(){
        System.out.println("Constructor of C");
    }

    C(String a){
        System.out.println("Constructor of C with params");
    }

    C(int val){
        super(val);
        System.out.println("Constructor of C with integer params");
    }
}
