/*
 * Необходимо удалить отрицательные элементы списка
 */
package Sem4.Task4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static Sem4.Task4.Methods.byCreatingNewList;
import static Sem4.Task4.Methods.byRemoveIf;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(
                -1, -2, -3, -4, -5, -6, -7, -8
        ));
        System.out.println("byRemoveIf(integerList) = " + byRemoveIf(integerList));
        System.out.println("byCreatingNewList(integerList) = " + byCreatingNewList(integerList));
    }
}
