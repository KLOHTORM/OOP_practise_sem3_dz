import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String o1Full = o1.getName() + o1.getAge();
        String o2Full = o2.getName() + o2.getAge();

        return o1Full.compareTo(o2Full);
    }



}
