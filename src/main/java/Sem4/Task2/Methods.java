package Sem4.Task2;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    /**
     * @ApiNote метод вычисляет сумму четных чисел множетсва
     * @param integerList
     * @return sumCountable
     */
    static Integer sumOfCountable(List<Integer> integerList) {
        int sumCountqble = 0;
        for (Integer item : integerList) {
            if (isEven(item)) {
                sumCountqble += item;
            }
        }
        return sumCountqble;
    }

    /**
     * @ApiNote Метод вычисляет сумму элементов списка с нечетным индексом
     * @param integerList
     * @return sumIndex
     */
    static Integer sumByIndex(List<Integer> integerList) {
        Integer sumIndex = 0;

        for (int i = 0; i < integerList.size(); i++) {
            if (isEven(i) && i != 0) {
                sumIndex += integerList.get(i);
            }
        }
        return sumIndex;
    }

    /**
     * @ApiNote метод вычисляет сумму нечетных элементов списка
     * @param integerList
     * @return sumUncauntable
     */
    static Integer sumOfUnCountable(List<Integer> integerList) {
        int sumUncauntable = 0;
        for (Integer item : integerList) {
            if (isEven(item)) {
                sumUncauntable += item;
            }
        }
        return sumUncauntable;
    }

    /**
     * @ApiNote метод проверяет четность элемента
     * @param item
     * @return true
     */
    static boolean isEven(int item) {
        return item % 2 == 0;
    }

    /**
     * ApiNote
     * @param integerList
     * @return
     */
    static List<Integer> itemChange(List<Integer> integerList) {
        List<Integer> newIntegers = new ArrayList<>(List.of());
        for (Integer item : integerList) {
            if (item % 3 != 0) {
                newIntegers.add(sumOfUnCountable(integerList));
            }
            else {
                newIntegers.add(item);
            }
        }
        return newIntegers;
    }
    static List<Integer> itemChangeSet(List<Integer> integerList) {
        int sum = sumOfUnCountable(integerList);
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) %3 == 0) integerList.set(i, sum);
        }
        return integerList;
    }
}
