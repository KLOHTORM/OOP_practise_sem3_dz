import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudyGroup>{
    private final List<StudyGroup> studyGroups;

    public Flow(List<StudyGroup> studyGroups){
        this.studyGroups = studyGroups;
    }

    @Override
    public Iterator<StudyGroup> iterator(){
        return studyGroups.iterator();
    }

    public int groupCount(){
        return studyGroups.size();
    }
}
