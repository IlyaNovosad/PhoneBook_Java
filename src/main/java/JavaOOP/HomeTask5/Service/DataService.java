package JavaOOP.HomeTask5.Service;


import JavaOOP.HomeTask5.Model.Student;
import JavaOOP.HomeTask5.Model.Teacher;
import JavaOOP.HomeTask5.Model.Type;
import JavaOOP.HomeTask5.Model.User;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class DataService {
    private final List<User> users = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Integer yearOfBirth, Type type) {
        Integer id = getFreeID(type);
        if (type == Type.STUDENT) {
            users.add(new Student(id, firstName, secondName, lastName, yearOfBirth));
        } else if (type == Type.TEACHER) {
            users.add(new Teacher(id, firstName, secondName, lastName, yearOfBirth));
        }
    }

    private int getFreeID(Type type) {
        boolean isStudent = type == Type.STUDENT;
        int lastId = 1;
        for (User user : users) {
            if (user instanceof Student && isStudent) {
                lastId = ((Student) user).getStudentID() + 1;
            } else if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher) user).getTeacherID() + 1;
            }
        }
        return lastId;
    }

    public List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student) {
                studentList.add((Student) user);
            }
        }
        return studentList;
    }

    public List<Student> getStudentListByID(List<Integer> id){
        List<Student> students = new ArrayList<>();
        for (Student student : getStudentList()) {
            for (Integer i : id) {
                if (student.getStudentID().equals(i)){
                    students.add(student);
                }
            }
        }
        return students;
    }
    public List<Teacher> getTeacherList() {
        List<Teacher> studentList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher) {
                studentList.add((Teacher) user);
            }
        }
        return studentList;
    }

    public Teacher getTeacherByID(Integer teacherID, List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            if (teacherID.equals(teacher.getTeacherID())) {
                return teacher;
            }
        }
        return null;
    }

}