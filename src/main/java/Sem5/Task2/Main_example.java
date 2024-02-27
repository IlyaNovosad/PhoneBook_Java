package Sem5.Task2;

import java.util.*;

public class Main_example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 9));
        System.out.println(containsDouble(list));
    }

    public static boolean containsDouble(List<Integer> list) {
        Map<Integer, Integer> dubs = new HashMap<>();
        for (Integer elem : list) {
            if(!dubs.containsKey(elem)) {
                dubs.put(elem, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
