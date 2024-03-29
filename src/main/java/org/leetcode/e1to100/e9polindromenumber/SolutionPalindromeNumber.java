package org.leetcode.e1to100.e9polindromenumber;

/**
 * LeetCode.com
 * ProblemList
 * 9. Palindrome Number
 * Проверить является ли число палиндромом, то есть одинаковое с двух сторон.
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 20.06.2023
 */
public class SolutionPalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || x != 0 && x % 10 == 0) {
            return false;
        }
        int reverted = 0;
        while (x > reverted) {
            reverted = 10 * reverted + (x % 10);
            if (x > reverted) {
                x = x / 10;
            }
        }
        return x == reverted || x == reverted / 10;
    }
}
