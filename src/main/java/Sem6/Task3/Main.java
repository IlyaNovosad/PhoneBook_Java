/*
    3) Найти пересечения слов в массивах и указать их общее количество.
    Пример:
    Mas1= [“qwe”,”asd”,”qwe”,”x”]
    Mas2=[“qwe”,”v”]
    Результат:
    qwe=3
*/

package Sem6.Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] massOne = {"qwe", "asd", "qwe", "x"};
        String[] massTwo = {"qwe", "v", "asd", "qwe", "qwe"};
        Set<String> setThree = listCompare(massOne, massTwo);
        counter(massOne, massTwo, setThree);
    }

    private static void counter(String[] massOne, String[] massTwo, Set<String> setThree) {
        List<String> union = new ArrayList<>(Arrays.asList(massOne));
        union.addAll(Arrays.asList(massTwo));
        System.out.println("union = " + union);
        for (String elem : setThree) {
            Integer couter = 0;
            for (String listElem : union) {
                if (elem == listElem) couter++;
            }
            System.out.println(elem + " = " + couter);
        }
    }

    private static Set<String> listCompare(String[] massOne, String[] massTwo) {
        Set<String> setOne = new HashSet<>(Arrays.asList(massOne));
        Set<String> setTwo = new HashSet<>(Arrays.asList(massTwo));
        Set<String> setThree = new HashSet<>(setOne);
        setThree.retainAll(setTwo);
        System.out.println("setThree = " + setThree);
        return setThree;
    }
}
