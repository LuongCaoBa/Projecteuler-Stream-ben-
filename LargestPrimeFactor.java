package projecteuler;


import java.math.BigInteger;
import java.util.stream.LongStream;
/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143?
 */

public class LargestPrimeFactor {
    public static void main(String[] args) {
        LongStream.rangeClosed(1L, (long) Math.sqrt(600851475143L))
                .mapToObj(BigInteger::valueOf)
                .filter(bi -> bi.isProbablePrime(100))
                .map(BigInteger::longValue)
                .forEach(System.out::println);
    }
}
