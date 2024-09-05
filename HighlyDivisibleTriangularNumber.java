package projecteuler;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HighlyDivisibleTriangularNumber {
    public static int divisors (int number) {
        return (int) IntStream.rangeClosed(1, number)
                .filter(i -> number % i == 0)
                .count();
    }

    public static void main(String[] args) {
        Stream.iterate(new int[] {1, 1}, array -> new int[] {array[0]++, (array[0] + 1) * array[0] / 2})
                .filter(array -> divisors(array[1]) == 501)
                .mapToInt(array -> array[1])
                .forEach(System.out::println);
    }
}
