package projecteuler;

import java.math.BigInteger;
import java.util.stream.LongStream;
/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */
public class SummationOfPrimes {
    public static void main(String[] args) {
        System.out.println(LongStream.rangeClosed(1L, 2_000_000L)
                .mapToObj(BigInteger::valueOf)
                .filter(bi -> bi.isProbablePrime(100))
                .map(BigInteger::longValue)
                .reduce(0L, Long::sum));
    }
}
