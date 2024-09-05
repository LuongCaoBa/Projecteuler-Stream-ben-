package projecteuler;

import java.util.Map;
import java.util.stream.IntStream;

/*
The sum of the squares of the first ten natural numbers is,
    1^2 + 2^2 + ... + 10^2 = 385.
The square of the sum of the first ten natural numbers is,
    (1 + 2 + ... + 10)^2 = 55^2 = 3025.
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {
    public static void main(String[] args) {
        int theSumOfTheSquares = IntStream.rangeClosed(1, 100).map(i -> (int) Math.pow(i,2)).sum();
        int theSquareOfTheSum = (int) Math.pow(IntStream.rangeClosed(1, 100).sum(), 2);
        System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is:" + (theSquareOfTheSum - theSumOfTheSquares));
    }
}
