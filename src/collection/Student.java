package collection;

public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private int age;
    private double psp;

    public Student(int id, String name, int age, double psp) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.psp = psp;
    }


    // natural ordering is descending of psp
    @Override
    public int compareTo(Student other) {
        if(this.psp == other.psp){
            return 0;
        }

        if(this.psp < other.psp){
            return 1;
        }

        return -1;
    }

    /*
    * this <----> other
    *
    * < 0 -> current object is smaller than the other object | this ... other |
    *
    * = 0 -> both students are equal. Put them in any order. | this ... other | or | other .. this|
    *
    * > 0 -> current student is greater than the other object  | other ... this |
    *
    * */
}
