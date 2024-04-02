package JavaOOP.Sem5.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher extends User{
    private Integer teacherID;

    public Teacher(int teacherID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + getTeacherID() +
                super.toString() +
                '}';
    }

}
