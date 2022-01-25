package example05;

public class types {
    public static void main(String[] args) {
        Integer i = 10;
        System.out.println("In main-before call function: i=" +i);
        changeInteger(i);
        System.out.println("IN main after call function: i=" +i
        );

    }

    private static void changeInteger(Integer i) {
    }
}
