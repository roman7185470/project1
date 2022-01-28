package task5;
// Написать программу которая находит корень линейного уравнения//
// ax+b=0//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int x = -b/a;
        System.out.println("x=" +x);
    }
}
