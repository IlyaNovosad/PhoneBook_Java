package Sem1.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Дан массив целых чисел.
        // Верно ли, что массив является симметричным.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];//todo: int [] arr = {1,2,3,4,5}; ввод
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //todo блок обработки
        boolean f = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                f = false;
                break;
            }
        }
        System.out.println(f);
        for (int i = 0; i < arr.length; i++) {//todo вывод
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
