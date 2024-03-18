package JavaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные пользователя (ФИО дата_рождения телефон пол) :");
        String userData = scanner.nextLine();

        ParseUserData.parseAndSaveUserData(userData);

        scanner.close();
    }
}