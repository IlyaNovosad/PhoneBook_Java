package Sem1.Task3;

import java.util.Scanner;

/**
 * @apiNote расширенное описание
 * @return Поменять местами ее половины.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String partOne = str.substring(0, str.length() / 2);
        String partTwo = str.substring(str.length() / 2 + 1);
        System.out.println(partTwo + partOne);
    }
}
