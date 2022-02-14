package example07;

public class DoubleCalc {
    public static void main(String[] args) {
        double i = 7.0;
        double j, z, k;
        j = i/0;
        z = -i/0;
        k = Math.sqrt(-i);
        if(j == Double.POSITIVE_INFINITY);
        System.out.println("Мы получили положительную бесконечность.");
        if(z == Double.NEGATIVE_INFINITY);
        System.out.println(" Мы получили отрицательную бесконечность.");
        if(Double.isNaN(k))
            System.out.println("Мы получили не число.");
        System.out.println("j=" +j+ "z=" +z+ "k=" +k);
    }
}
