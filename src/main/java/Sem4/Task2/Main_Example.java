package Sem4.Task2;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main_Example {
    public static void main(String[] args) {

        List<Integer> integerList = new LinkedList<>(Arrays.asList(
                1, 2, 3, 4, 5
        ));
        System.out.println("getSumEven(integerList) = " + getSumEven(integerList));
        System.out.println("getSumOdd(integerList) = " + getSumOdd(integerList));
    }
    private static Integer getSumEven(List<Integer> integerList) {
        int sum = 0;
        for (Integer item : integerList) {
            if (isEven(item)) sum += item;
        }
        return sum;
    }
    private static Integer getSumOdd(List<Integer> integerList) {
        int sum = 0;
        for (Integer item : integerList) {
            if (!isEven(item)) sum += item;
        }
        return sum;
    }
    private static boolean isEven(Integer item) {
        return item % 2 == 0;
    }
}
