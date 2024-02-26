package Sem4.Task4;

import java.util.LinkedList;
import java.util.List;

public class Methods {
    public static List<Integer> byRemoveIf(List<Integer> integerList) {
        integerList.removeIf(item -> item < 0);
        return integerList;
    }

    public static List<Integer> byCreatingNewList(List<Integer> integerList) {
        List<Integer> newIntegerList = new LinkedList<>(List.of());
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > 0) {
                newIntegerList.add(integerList.get(i));
            }
        }
        return newIntegerList;
    }
}
