package Sem1.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //todo: Данный код подходит для случаев с трехзначными числами, необходимо переработать!
        /*
        int tempOne = number / 100;
        System.out.println("tempOne = " + tempOne);
        int tempTwo = number % 100 / 10;
        System.out.println("tempTwo = " + tempTwo);
        int tempThree = number % 10;
        System.out.println("tempThree = " + tempThree);
        int digits = tempOne * tempTwo * tempThree;
        System.out.println("digits = " + digits);


        int sum = tempOne + tempTwo + tempThree;
        System.out.println("digits - sum = " + (digits - sum));
        */

        int digit = 1;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            digit *= number % 10;
            number /= 10;
        }
//        System.out.println("sum = " + sum);
//        System.out.println("digit = " + digit);
        System.out.println("result = " + (digit - sum));
    }
}

