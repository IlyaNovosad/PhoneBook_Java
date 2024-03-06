package JavaOOP.HomeTask4;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Teacher extends User implements Comparable<Teacher>{
    Integer teacherID;
    public Teacher(Integer teacherID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher {" + teacherID +
                ", " + super.getFirstName() +
                ", " + super.getSecondName() +
                ", " + super.getLastName() +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherID.compareTo(o.teacherID);
    }
}
