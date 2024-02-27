/*
    Написать перевод из римских цифр в арабские
    I 1
    V 5
    X 10
    L 50
    C 100
    D 500
    M 1000
    1) ввод: s = "LVIII"
    вывод: 58
    разбор: L = 50, V= 5, III = 3.
    2) ввод: s = "MCMXCIV"
    вывод: 1994
    разбор: M = 1000, CM = 900, XC = 90 and IV = 4.
*/
package Sem5.Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("getArabicNumber(line) = " + getArabicNumber(line));
    }

    public static Integer getArabicNumber(String line) {
        Map<Character, Integer> map = new HashMap<>(Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        ));
        int result = map.get(line.charAt(line.length() - 1));
        for (int i = 0; i < line.length() - 1; i++) {
            if (map.get(line.charAt(i)) < map.get(line.charAt(i + 1))) {
                result -= map.get(line.charAt(i));
            } else {
                result += map.get(line.charAt(i));
            }
        }
        return result;
    }
}
