package example1.task2;

// С клавиатурры вводится двузначное натуральное число.//
// Вывести на экран количество десятков в нем.//

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
  int x = scanner.nextInt();

  int y = x % 10;
  System.out.println(y);
  }


}
