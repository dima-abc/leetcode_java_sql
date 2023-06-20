package org.leetcode.e1to100.e9polindromenumber;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * LeetCode.com
 * ProblemList
 * 9. Palindrome Number  Test
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 20.06.2023
 */
class SolutionPalindromeNumberTest {
    private final SolutionPalindromeNumber palindrome = new SolutionPalindromeNumber();

    @Test
    void whenExample1X121ThenTrue() {
        int x = 121;
        var actual = palindrome.isPalindrome(x);
        assertThat(actual).isTrue();
    }

    @Test
    void whenExample2XNegative121ThenFalse() {
        int x = -121;
        var actual = palindrome.isPalindrome(x);
        assertThat(actual).isFalse();
    }

    @Test
    void whenExample3X10ThenFalse() {
        int x = 10;
        var actual = palindrome.isPalindrome(x);
        assertThat(actual).isFalse();
    }

    @Test
    void whenExample4X37573ThenTrue() {
        int x = 37573;
        var actual = palindrome.isPalindrome(x);
        assertThat(actual).isTrue();
    }
}