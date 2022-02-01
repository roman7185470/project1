package task11;
//Ввести склавиатуры два 3 х значных числа и поменять у них средние цифры//
//(например ввести 357 и 702- получит и вывести числа 307 и 752//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, valuec, valued;
        a = 357;
        b = 702;
        valuec = (a % 100) - a%10;
        valued = (b % 100) - b%10;
        a +=valued - valuec;
        b +=valuec - valued;
        System.out.println("c = " + a);
        System.out.println("d = " + b);

    }
}
