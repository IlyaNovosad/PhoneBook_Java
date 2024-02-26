/*
2. Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
 */

package Sem3.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = getStudents();

        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();

        ArrayList<Integer> scholarship = new ArrayList<>();
        ArrayList<String> surname = new ArrayList<>();
        for (Student student : students) {
            if (student.getSureName().endsWith(search) && student.getPoints() % 2 == 0) {
                surname.add(student.getSureName());
                scholarship.add(student.getScholarship());
            }
        }
        System.out.println("surname = " + surname);
        System.out.println("scholarship = " + scholarship);
    }

    private static ArrayList<Student> getStudents() {
        Student studentFirst = new Student("Ivanova", 3, 1000, 4);
        Student studentSecond = new Student("Petrova", 1, 1400, 5);
        Student studentThird = new Student("Sidorova", 2, 1300, 3);
        Student studentFourth = new Student("Frolova", 4, 1200, 4);
        Student studentFifth = new Student("Stepanova", 2, 1500, 4);
        Student studentSixth = new Student("Kulikov", 1, 2000, 4);
        Student studentSeventh = new Student("Trofimov", 3, 5000, 5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(studentFirst);
        students.add(studentSecond);
        students.add(studentThird);
        students.add(studentFourth);
        students.add(studentFifth);
        students.add(studentSixth);
        students.add(studentSeventh);
        return students;
    } //todo : создание коллекции и помещение в нее студентов
}
