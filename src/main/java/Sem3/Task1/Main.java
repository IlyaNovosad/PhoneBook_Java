/*
1. Даны сведения об экспортируемых товарах: указывается наименование товара, страна, экспортирующая товар,
 и объем поставляемой партии в штуках. Найти страны, ко	торые экспортируют данный(введенный с кл-ы) товар, и общий
 объем его экспорта.
*/

package Sem3.Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item itemOne = new Item("logka", "ru", 10000);
        Item itemTwo = new Item("vilka", "ru", 10000);
        Item itemThree = new Item("nog", "ru", 10000);
        Item itemFour = new Item("vilka", "en", 9000);
        Item itemFive = new Item("nog", "en", 129000);

        ArrayList<Item> itemList = new ArrayList<>(); //обозначение обобщенных видов данных (дженерик)
        itemList.add(itemOne);
        itemList.add(itemTwo);
        itemList.add(itemThree);
        itemList.add(itemFour);
        itemList.add(itemFive);

        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();

        /*
        for (int i = 0; i < itemList.size(); i++) {
            Item elem = itemList.get(i);

        } // todo: цикл фор для прохода по всему списку, проходит по индексам и берет элементы, где необходимо
        //todo: использовать значение нескольких элементов
         */
        ArrayList<String> country = new ArrayList<>();
        Integer sumVolume = 0;
        for (Item elem : itemList) {
            if (elem.getName().equals(search)) {
                sumVolume += elem.getVolume();
                country.add(elem.getCountry());
            }
        } //todo: цикл фор для прохода по ссылкам, проходит по ссылкам на элемента (быстрее), где необходимо
        //todo:  использовать только текущий элемент
        System.out.println(sumVolume);
        System.out.println("country = " + country);
    }
}
