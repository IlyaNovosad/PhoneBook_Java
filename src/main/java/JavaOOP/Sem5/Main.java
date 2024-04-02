package JavaOOP.Sem5;

import JavaOOP.Sem5.Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Ilya", "Yurievich", "Novosad");
        controller.printStudents();
    }
}
