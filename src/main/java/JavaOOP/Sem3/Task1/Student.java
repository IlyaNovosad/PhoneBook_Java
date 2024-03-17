package JavaOOP.Sem3.Task1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//todo : Выполнили имплементацию с интерфейсом Comparable<>
public class Student implements Comparable<Student>{
    public Integer studentID;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(int studentID, String firstName, String secondName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
//todo : При работе с интерфейсом Comparable<> мы можем реализовать только одно сравнение
    @Override
    public int compareTo(Student o) {
        //todo : ручное описание сравнения
        if (this.studentID < o.studentID) {
            return  -1;
        } else if (this.studentID > o.studentID) {
            return 1;
        }
        //todo : готовая реализация сравнения
        //return this.studentID.compareTo(o.studentID);
        return 0;
    }
}
