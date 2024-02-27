/*
    1) Дан массив чисел, посчитать процент уникальных чисел.
    процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
*/

package Sem6.Task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 3, 1, 3};
//        List<Integer> list = Arrays.asList(array);
//        System.out.println("list = " + list);
//        Set<Integer> newSet = new HashSet<>(list);
//        System.out.println("newSet = " + newSet);
        toSet(array);
    }

    /**
     * @ApiNote перевод массива в множество и определение процента уникальных значений
     * @param array массив целых чисел
     */
    private static void toSet(Integer[] array) {
        Set<Integer> set = new HashSet<>(); //todo : Set добавляет в свою коллекцию только неповторяющиеся значения
        for (Integer elem : array) {
            set.add(elem);
        }
        int percent = (set.size() * 100) / array.length;
        System.out.println("set = " + set);
        System.out.println("percent = " + percent);
    }
}
