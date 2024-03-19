import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {
    @Override
    public int compare(Flow o1, Flow o2) {
        return Integer.compare(o1.groupCount(), o2.groupCount());
    }
}
