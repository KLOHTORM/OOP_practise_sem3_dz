import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student> {
    List<Student> people = new ArrayList<>();

    public StudyGroupIterator(List<Student> students){
        this.people = students;
    }
    private int count;
    @Override
    public boolean hasNext() {
        return count < people.size();
    }

    @Override
    public Student next() {
        return people.get(count++);
    }




}
