/*
    2) Найти пересечение двух множеств
    Пример:
    set1= [1,2,3,4]
    set2= [3,5,6,7]
    Вывод в консоль:
    [3]
*/

package Sem6.Task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> setOne = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> setTwo = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        Set<Integer> setThree = new HashSet<>(setOne);
        setThree.retainAll(setTwo);
        System.out.println("setOne = " + setOne);
        System.out.println("setTwo = " + setTwo);
        System.out.println("setThree = " + setThree);
    }
}
