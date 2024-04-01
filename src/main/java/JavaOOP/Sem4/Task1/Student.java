package JavaOOP.Sem4.Task1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends User implements Comparable<Student>{
    private Integer studentID;
    public Student(int studentID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID =" + " " + getStudentID() +
                super.toString() +
                '}';
    }

    public int compareTo(Student student) {
        //todo : ручное описание сравнения
        if (this.studentID < student.studentID) {
            return  -1;
        } else if (this.studentID > student.studentID) {
            return 1;
        }

        return 0;
    }
}