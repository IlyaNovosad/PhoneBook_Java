/*
2) Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
В противном случае (false).
*/

package Sem5.Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 9));
        Map<Integer, Integer> dubs = new HashMap<>();
        for (Integer elem : list) {
            dubs.putIfAbsent(elem, 0);
            dubs.put(elem, dubs.get(elem) + 1);
        }
        System.out.println("dubs = " + dubs);

        System.out.println("checking(dubs) = " + containsDouble(dubs));
    }

    private static boolean containsDouble(Map<Integer, Integer> dubs) {
        for (Map.Entry<Integer, Integer> element : dubs.entrySet()) {
            if (element.getValue() > 1) {
                return true;
            }
        }
        return false;
    }
}

