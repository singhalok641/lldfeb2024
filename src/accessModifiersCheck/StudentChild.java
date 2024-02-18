package accessModifiersCheck;

import accessModifiers.Student;

public class StudentChild extends Student{

    public void doSomething(){
        this.psp = 91.0; //protected
//        this.name = "Alok"; // private
//        this.batchId = 123; // default
        this.univName = "SST"; // public
    }
}
