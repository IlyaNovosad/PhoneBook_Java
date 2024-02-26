/*
    Посчитать количество вхождений каждого символа в текст.
*/

package Sem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> mapChar = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(!mapChar.containsKey(str.charAt(i))) {
                mapChar.put(str.charAt(i), 1);
            } else {
                mapChar.put(str.charAt(i), mapChar.get(str.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character, Integer> elem : mapChar.entrySet()) {
            System.out.println("значение " + elem.getKey() + " встретился " + elem.getValue() + " раз");
        }
    }
}
