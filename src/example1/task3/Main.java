package example1.task3;

import java.util.Scanner;

//Дано целое число n. Выведите следующее за ним целое число
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число = ?");
        int x = scanner.nextInt();
        System.out.println(x - x%2 + 2);

    }

}
