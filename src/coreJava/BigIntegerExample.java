package coreJava;

import java.math.BigInteger;
//https://www.baeldung.com/java-bigdecimal-biginteger
public class BigIntegerExample {
    public static void main(String[] args) {
        BigInteger i = new BigInteger("4");
        BigInteger j = new BigInteger("2");

        BigInteger sum = i.add(j);
        BigInteger difference = i.subtract(j);
        BigInteger quotient = i.divide(j);
        BigInteger product = i.multiply(j);
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(quotient);
        System.out.println(product);
    }
}
