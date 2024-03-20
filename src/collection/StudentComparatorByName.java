package collection;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getName().equals(o2.getName())){
            return 0;
        }

        if(o1.getName().compareTo(o2.getName()) < 0){
            return -1;
        }

        return 1;
    }
}
