package JavaOOP.HomeTask6;

public class Student extends User implements Comparable<Student> {
    private final Integer studentId;

    public Student(Integer studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student {" + studentId +
//                super.toString() +
                ", " + super.getFirstName() +
                ", " + super.getSecondName() +
                ", " + super.getLastName() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}

