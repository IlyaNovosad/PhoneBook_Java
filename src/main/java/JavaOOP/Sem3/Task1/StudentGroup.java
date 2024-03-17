package JavaOOP.Sem3.Task1;

import java.util.Iterator;
import java.util.List;
//todo : Выполнили имплементацию с интерфейсов Iterable<>
public class StudentGroup implements Iterable<Student>{
    public List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
