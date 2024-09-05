package projecteuler;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.stream.LongStream;

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11 and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
 */
public class Prime {
    public static void main(String[] args) {
        System.out.println(LongStream.iterate(2, l -> l + 1)
                .mapToObj(BigInteger::valueOf)
                .filter(bi -> bi.isProbablePrime(100))
                .limit(10001)
                .map(BigInteger::longValue)
                .toList().get(10000));
    }
}
