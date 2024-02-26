/*1) Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5,
перед которыми идет четное число.
 */

package Sem2.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите несколько чисел: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int current = sc.nextInt();

        for (int i = 0; i < number; i++) {
            int next = sc.nextInt();
            if (next % 10 == 5 && current % 2 == 0){
                sum += next;
            }
            current = next;
        }
        System.out.print("Сумма элементов равна: ");
        System.out.println(sum);
    }
}
