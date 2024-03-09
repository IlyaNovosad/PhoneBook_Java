package JavaOOP.HomeTask3;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public record StudentGroupService(StudentGroup studentGroup) {

    public List<Student> getSortedStudentGroup() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentGroupByFIO() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new StudentComparator());
        return studentList;
    }
}