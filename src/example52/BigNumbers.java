package example52;
import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        BigInteger numI1, numI2, bignumI;
        BigDecimal numD1, numD2, bignumD;
        numI1 = BigInteger.valueOf(100000000);//преобразование чисоа в большое число//
        numI2 = BigInteger.valueOf(200000);
        bignumI = BigInteger.valueOf(1);
        for(int i = 0; i<10000000; i++)
            bignumI = bignumI . add(numI1.multiply(numI2).multiply(numI2));
        System.out.println("bignumI = " +bignumI);
    }
}
