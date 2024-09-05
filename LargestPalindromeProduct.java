package projecteuler;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 * 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromeProduct {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(100, 999)
                .boxed()
                .flatMap(i -> IntStream.rangeClosed(100, i)
                        .mapToObj(j -> i * j))
                .filter(LargestPalindromeProduct::isPalindrome)
                .max(Integer::compare)
                .orElse(0));
    }
    public static boolean isPalindrome(int num) {
        int rev = 0;
        int number = num;
        while (num > 0) {
            rev = rev * 10;
            rev += num % 10;
            num = num/10;
        }
        return number == rev;
    }
}
