/*
4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса, для валидного перевода величин.
Метод для конвертации назовите "convertValue".
*/

package Sem6.Task4;

public class Main {
    public static void main(String[] args) {
        Converter celOne = new Celsius();
        System.out.println("celOne.convertValue(100) = " + celOne.convertValue(100));
        Converter celTwo = new Fahrenheit();
        System.out.println("celTwo.convertValue(100) = " + celTwo.convertValue(100));
        Converter celThree = new Kalvin();
        System.out.println("celThree.convertValue(100) = " + celThree.convertValue(100));
    }
}
