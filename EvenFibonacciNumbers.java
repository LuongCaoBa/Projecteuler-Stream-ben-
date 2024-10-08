package projecteuler;
import java.util.stream.Stream;
/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:
        1, 2, 3, 5, 8, 13, 21, 34, 55, 89,...
By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.
 */

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int limit = 4000000;

        // Generate an infinite stream of Fibonacci numbers
        int sumEven = Stream.iterate(new int[]{1, 2}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .mapToInt(fib -> fib[0])  // Extract the first element of the array
                .takeWhile(n -> n <= limit)  // Limit the stream to values <= 4000000
                .filter(n -> n % 2 == 0)  // Filter only even numbers
                .sum();  // Sum the remaining values

        System.out.println("The sum of the even-valued terms in the Fibonacci sequence not exceeding four million is: " + sumEven);
    }
}
