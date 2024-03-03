package JavaOOP.HomeTask3;

import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.List;

@Setter
@Getter
public class StudentGroup implements Iterable<Student> {
    private List<Student> studentList;

    private int numberGroup;

    public StudentGroup(List<Student> studentList, int numberGroup) {
        this.studentList = studentList;
        this.numberGroup = numberGroup;
    }


    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return "Number group " + getNumberGroup();
    }
}