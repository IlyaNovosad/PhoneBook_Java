package Sem3.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Cube> cubes = new ArrayList<>(Arrays.asList(
                new Cube(3, "Red", "Wood"),
                new Cube(5, "Blue", "Metal"),
                new Cube(7, "Yellow", "Plastic"),
                new Cube(3, "Yellow", "Plastic"),
                new Cube(3, "Purple", "Wood"),
                new Cube(5, "Yellow", "Plastic")
        ));
        //todo: Расчет суммарного объема по выбранному цвету
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine().toLowerCase();
        int countOne = 0;
        Integer sizeSum = 0;
        for (Cube cube : cubes) {
            if(cube.getColor().toLowerCase().equals(color)) {
                sizeSum += cube.size();
                countOne++;
            }
        }
        System.out.println("size = " + sizeSum);
        System.out.println("countOne = " + countOne);

        //todo: Определение количества кубиков из указанного материала с длинной грани 3
        Scanner scTwo = new Scanner(System.in);
        String material = scTwo.nextLine().toLowerCase();
        int countTwo = 0;
        for (Cube cube : cubes) {
            if (cube.getMaterial().toLowerCase().equals(material) && cube.getLength().equals(3)) {
                countTwo++;
            }
        }
        System.out.println("count = " + countTwo);
    }
}
