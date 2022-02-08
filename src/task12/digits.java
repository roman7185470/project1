package task12;
// Ввести с клавиатуры 4х значное число и 307 и 752, посчитать сумму 1ой и 3й цифры//
// и разность 2й и 4й цифры//

import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z, k;
        x = 307;
        y = 752;
        z = (x /100) + (y / 100) ;
        k = (x / 10) - (y / 10);
        System.out.println("z =" +z);
        System.out.println("k =" +k);
    }
}
