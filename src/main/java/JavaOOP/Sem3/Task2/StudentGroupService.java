package JavaOOP.Sem3.Task2;

import JavaOOP.Sem3.Task1.Student;
import JavaOOP.Sem3.Task1.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    public List<Student> getSortedStudentGroup() {
        List<Student> result = new ArrayList<>(studentGroup.studentList);
        Collections.sort(result);
        return result;
    }
    public void printList(List<Student> studentList){
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
    public List<Student> getSortedStudentGroupByFIO() {
        List<Student> result = new ArrayList<>(studentGroup.studentList);
        result.sort(new StudentComparator());
        return result;
    }
}
