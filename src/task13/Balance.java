package task13;//Сколько товара ценой Y можно купить на Х долларов
// и сколько получить сдачи?

public class Balance {

    public static <cash,purchase, balance> void main(String[] args) {
        int x;
        int y;

        x  = 1000;
         y = 23;
         System.out.println("count balance" + (x%y) );

    }
}
