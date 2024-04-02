package JavaOOP.Sem5.Service;

import JavaOOP.Sem5.Model.Student;
import JavaOOP.Sem5.Model.Teacher;
import JavaOOP.Sem5.Model.Type;
import JavaOOP.Sem5.Model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private final List<User> users = new ArrayList<>();
    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeID(type);
        if (type == Type.STUDENT) {
            users.add(new Student(id, firstName, secondName, lastName));
        } else if (type == Type.TEACHER) {
            users.add(new Teacher(id, firstName, secondName,lastName));
        }
    }
    private int getFreeID(Type type) {
        boolean isStudent = type == Type.STUDENT;
        int lastID = 1;
        for (User user : users) {
            if (user instanceof Student && isStudent)
                lastID = ((Student) user).getStudentID() + 1;
            else if (user instanceof Teacher && !isStudent)
                lastID = ((Teacher) user).getTeacherID() + 1;
        }
        return lastID;
    }
    public List<User> getUsers() {
        return users;
    }
    public List<User> getStudents() {
        List<User> studentList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student)
                studentList.add(user);
        }
        return studentList;
    }
}
