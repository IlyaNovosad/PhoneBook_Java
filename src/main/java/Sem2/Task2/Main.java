/*2) Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.*/
package Sem2.Task2;

public class Main {
    public static void main(String[] args) {
        int [] arr = {4,8,2,6,3,5,2,10};
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] * 2) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
