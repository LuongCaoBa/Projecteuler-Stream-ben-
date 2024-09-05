package projecteuler;

import java.util.stream.IntStream;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {
    // Function to compute the Greatest Common Divisor (GCD) using Euclid's algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to compute the Least Common Multiple (LCM) using the GCD
    public static long lcm(int a, int b) {
        return (a / gcd(a, b)) * (long) b; // Casting to long to prevent overflow
    }

    public static void main(String[] args) {
        long result = IntStream.rangeClosed(1, 20)
                .reduce(1, (a, b) -> (int) lcm(a, b));
        System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is " + result);
    }
}
