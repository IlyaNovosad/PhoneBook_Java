package Sem3.Task2_Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// 2. Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
// Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.


        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("Петрова", 101, 5000, Arrays.asList(5, 4, 3)),
                new Student("Пузиков", 102, 5000, Arrays.asList(5, 4, 3)),
                new Student("Иванова", 103, 5000, Arrays.asList(4, 4, 3)),
                new Student("Толканюк", 101, 5000, Arrays.asList(5, 4, 3))));

        for (Student student : studentList) {
            if (student.getSurname().endsWith("ова") && student.evenGrades()) {
                System.out.println("student.getSurname() = " + student.getSurname());
                System.out.println("Stipa = " + student.getStipendia());
            }
        }

    }
}
