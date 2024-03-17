package JavaOOP.Sem3.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        Student studentTwo = new Student(2, "Qqq", "Www", "Eee");
        Student studentOne = new Student(1, "Aaa", "Bbb", "Ccc");
        Student studentFour = new Student(4, "Aaa", "Aaa", "Aaa");
        Student studentThree = new Student(3, "Www", "Www", "Www");
        studentGroup.studentList.add(studentOne);
        studentGroup.studentList.add(studentTwo);
        studentGroup.studentList.add(studentThree);
        studentGroup.studentList.add(studentFour);

        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(iterator.next());
        iterator = new StudentGroupIterator(studentGroup);
        System.out.println("______________________________");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.studentID == 1) iterator.remove();
            System.out.println(student);
        }
        iterator.index = 0;
        System.out.println("______________________________");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //todo : Данная переборка списка студентов стала возможна только после имплементации класса StudentGroup
        // с интерфейсом Iterable
        System.out.println("______________________________");
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println(studentThree.compareTo(studentTwo));
    }
}
