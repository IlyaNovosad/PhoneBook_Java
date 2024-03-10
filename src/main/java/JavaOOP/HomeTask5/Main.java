package JavaOOP.HomeTask5;



import JavaOOP.HomeTask5.Controller.Controller;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Aaa", "Bbb", "Ccc", 1984);
        controller.createStudent("Ttt", "Bbb", "Ppp", 1983);
        controller.createStudent("Aaa", "Ooo", "Mmm", 1985);
        controller.getAllStudents();
        controller.createTeacher("Fff", "Jjj", "Lll", 1975);
        controller.getAllUsers();
        controller.createStudyGroup(1, new ArrayList<>(Arrays.asList(1, 2)));
        controller.getStudyGroup();
    }
}