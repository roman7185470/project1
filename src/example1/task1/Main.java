package example1.task1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //создание обьекта ввода
        Scanner scanner = new Scanner(System.in);

        //инициализация переменной из ввода
        int x = scanner.nextInt();

        //вывод исохранение младшего разряда числа//
        //15 -> 5; 49 -> 9;
        //получение остатка от деления на 10//
        int y = x % 10;

        //вывод значения в консоль//
        System.out.println(
                " Младший разряд числа "
                + x
                + " равен "
                + y


        );



    }
}
