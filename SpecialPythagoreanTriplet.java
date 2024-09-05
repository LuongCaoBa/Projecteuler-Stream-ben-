package projecteuler;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
    a^2 + b^2 = c^2.
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        OptionalInt result = IntStream.rangeClosed(1, 1000)
                .flatMap(a -> IntStream.rangeClosed(a, 1000 - a)
                        .flatMap(b -> IntStream.rangeClosed(b, 1000 - a - b)
                                .filter(c -> a + b + c == 1000 && a * a + b * b == c * c)
                                .map(c -> a * b * c)))
                .findFirst();

        if (result.isPresent()) {
            System.out.println("The product abc is " + result.getAsInt());
        } else {
            System.out.println("No Pythagorean triplet found.");
        }
    }
}
