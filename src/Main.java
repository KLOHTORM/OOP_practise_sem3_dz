import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", 30);
        Student student2 = new Student("Дмитрий", 17);
        Student student3 = new Student("Владимир", 19);
        Student student4 = new Student("Григорий", 25);
        Student student5 = new Student("Сергей", 18);
        Student student6 = new Student("Тимофей", 19);

        ArrayList<Student> list = new ArrayList<>(List.of(student1, student2, student3, student4, student5, student6));
        System.out.println(student1.compareTo(student2));

        StudyGroup students1 = new StudyGroup(List.of(student1, student2));
        StudyGroup students2 = new StudyGroup(List.of(student3, student4));
        StudyGroup students3 = new StudyGroup(List.of(student5, student6));
        Iterator<Student> iterator = students1.iterator();

        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.getName() + ": " + student.getAge());
        }

        Collections.sort(list, new StudentComparator());
        System.out.println(list.toString().substring(1, list.toString().length()-1));
        Flow flow1 = new Flow(List.of(students3, student5));
        Flow flow2 = new Flow(List.of(student1, student2, student4, student6));

        StreamComparator comparator = new StreamComparator();
        int result = comparator.compare(flow1, flow2);
        if (result > 0) {System.out.println("В первом потоке ббольше");}
        else if (result < 0) {System.out.println("Во втором потоке больше");}
        else {System.out.println("Потоки совпадают");}



    }
}