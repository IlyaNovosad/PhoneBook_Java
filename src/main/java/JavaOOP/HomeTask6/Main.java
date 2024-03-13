package JavaOOP.HomeTask6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Tatiana", "Ivanovna", "Sidorova");
        Teacher teacher1 = new Teacher(2, "Ivan", "Vasilievich", "Ivanov");
        Teacher teacher2 = new Teacher(3, "Svetlana", "Borisovna", "Petrova");
        TeacherView tv = new TeacherView();
        TeacherService tservice = new TeacherService();
        List<Teacher> teacherList = new ArrayList<>(Arrays.asList(teacher1, teacher, teacher2));

        tv.sendToConsole(teacherList);
        System.out.println("-------------------------------");
        tservice.getSortedTeacherList(teacherList);
        tv.sendToConsole(teacherList);
        System.out.println("===================================");
        tservice.getSortedTeacherListByFIO(teacherList);
        tv.sendToConsole(teacherList);
    }
}
