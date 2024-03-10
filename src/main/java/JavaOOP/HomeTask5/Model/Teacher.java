package JavaOOP.HomeTask5.Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Teacher extends User {
    private Integer teacherID;
    public Teacher(Integer teacherID, String firstName, String secondName, String lastName, Integer yearOfBirth) {
        super(firstName, secondName, lastName, yearOfBirth);
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "ID: " + teacherID + " "
                + super.toString() +
                '}';
    }
}