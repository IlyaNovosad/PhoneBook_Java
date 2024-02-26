/*
 * Построить однонаправленный список целых чисел.
 * 1. Найти сумму четных элементов.
 * 2. Найти сумму элементов с четными индексами.
 * 3. Найти сумму нечетных элементов.
 * 4. Заменить, некратные 3 элементы списка, суммой нечетных элементов
 * 5. Заменить, кратные 3 элементы списка, суммой нечетных элементов
 */
package Sem4.Task2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static Sem4.Task2.Methods.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8
        ));
        System.out.println("sumByIndex(integerList) = " + sumByIndex(integerList));
        System.out.println("sumOfCountable(integerList) = " + sumOfCountable(integerList));
        System.out.println("sumOfUnCountable(integerList) = " + sumOfUnCountable(integerList));
        System.out.println("integerList = " + integerList);
        System.out.println("itemChange(integerList) = " + itemChange(integerList));
        System.out.println("itemChangeSet(integerList) = " + itemChangeSet(integerList));
    }
}
