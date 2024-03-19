import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>{
    List<Student> people = new ArrayList<>();
    public StudyGroup(List<Student> students){
        this.people = students;
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(people);
    }
}
