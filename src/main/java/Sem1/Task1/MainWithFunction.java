package Sem1.Task1;

import java.util.Scanner;

public class MainWithFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //todo : Вспомогательный класс для вврда с клавиатуры
        int n = scanner.nextInt();
        int result = SubstractPrMinusSum(n);
        System.out.println("pr - sum = " + result); // todo : в будущем стоит удалять все принты, так как результат работы кода используется не ввиде консольного вывода
    }

    public static int SubstractPrMinusSum(int n) {
        int pr = 1;
        int sum = 0;
        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return pr - sum;
    }
}