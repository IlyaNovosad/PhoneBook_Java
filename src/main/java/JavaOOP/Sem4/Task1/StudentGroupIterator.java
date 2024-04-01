package JavaOOP.Sem4.Task1;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    public int index = 0;

    public StudentGroupIterator(int index) {
        this.index = index;
    }

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        if (this.hasNext()) {
            return (studentList.get(index++));
        }
        return null;
    }

    @Override
    public void remove() {
        studentList.remove(--index);
    }
}
