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
*/
package Sem5.Task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>(Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        ));
        System.out.println("map = " + map);
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < line.length(); i++) {
            result += map.get(line.charAt(i));
        }
        System.out.println("result = " + result);
    }
}
