package JavaOOP.Sem5.Controller;

import JavaOOP.Sem5.Model.Student;
import JavaOOP.Sem5.Model.Type;
import JavaOOP.Sem5.Model.User;
import JavaOOP.Sem5.Service.DataService;
import JavaOOP.Sem5.View.StudentView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    public void createStudent(String firstName, String secondName, String lastName) {
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName) {
        service.create(firstName, secondName, lastName, Type.TEACHER);
    }
    public void printStudents() {
        List<User> studentList = service.getStudents();
        for (User user : studentList) {
            view.printOnConsole((Student) user);
        }
    }
}
