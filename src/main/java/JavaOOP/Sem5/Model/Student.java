package JavaOOP.Sem5.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends User {
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
}
