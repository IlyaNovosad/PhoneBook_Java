package JavaOOP.Sem4.Task1;

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
        result.sort(new UserComparator<Student>());
        return result;
    }
}
