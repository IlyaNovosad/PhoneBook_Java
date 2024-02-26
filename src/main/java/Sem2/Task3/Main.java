package Sem2.Task3;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Main {
    public static void main(String[] args) {
        Vector vectorOne = new Vector(1.0, 2.0,1.0);
        Vector vectorTwo = new Vector(1.0, 1.0, 1.0);
        System.out.println("vectorOne = " + vectorOne);
        System.out.println("vectorOne = " + vectorOne.length());
        System.out.println("vectorTwo = " + vectorTwo);
        System.out.println("vectorTwo = " + vectorTwo.length());
        System.out.println("vectorOne.scalar(vectorTwo) = " + vectorOne.scalar(vectorTwo));
        Vector vectorThree = vectorOne.multiply(vectorTwo);
        System.out.println("vectorThree = " + vectorThree);
        System.out.println("vectorOne.cos(vectorTwo) = " + vectorOne.cos(vectorTwo));
        System.out.println("vectorOne.sum(vectorTwo) = " + vectorOne.sum(vectorTwo));
        System.out.println("vectorOne.degree(vectorTwo) = " + vectorOne.degree(vectorTwo));
        log.error("test = {}", vectorThree);
    }
}
