package JavaOOP.Sem3.Task2;

import JavaOOP.Sem3.Task1.Student;
import JavaOOP.Sem3.Task1.StudentGroup;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        Student studentOne = new Student(1, "Aaa", "Bbb", "Ccc");
        Student studentTwo = new Student(2, "Qqq", "Www", "Eee");
        Student studentThree = new Student(3, "Qqq", "Www", "Www");
        Student studentFour = new Student(4, "Aaa", "Aaa", "Aaa");
        studentGroup.studentList.add(studentTwo);
        studentGroup.studentList.add(studentOne);
        studentGroup.studentList.add(studentFour);
        studentGroup.studentList.add(studentThree);
        StudentGroupService service = new StudentGroupService(studentGroup);
        service.printList(studentGroup.studentList);
        System.out.println("___________________________________");
        service.printList(service.getSortedStudentGroup());
        System.out.println("___________________________________");
        service.printList(studentGroup.studentList);
        System.out.println("___________________________________");
        service.printList(service.getSortedStudentGroupByFIO());
    }
}
