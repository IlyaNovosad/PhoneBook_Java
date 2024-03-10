package JavaOOP.HomeTask5.Model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student extends User {
    private Integer studentID;

    public Student(Integer studentID, String firstName, String secondName, String lastName, Integer yearOfBirth) {
        super(firstName, secondName, lastName, yearOfBirth);
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student {" +
                "ID: " + studentID + " "
                + super.toString() +
                '}';
    }
}