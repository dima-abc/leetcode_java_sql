package org.leetcode.e200to300.e242;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * LeetCode.com
 * ProblemList
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 05.03.2024
 */
class ValidAnagramTest {
    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void test1() {
        String s = "anagram";
        String t = "nagaram";
        boolean actual = validAnagram.isAnagram(s, t);
        assertThat(actual).isTrue();
    }

    @Test
    void test2() {
        String s = "rat";
        String t = "car";
        boolean actual = validAnagram.isAnagram(s, t);
        assertThat(actual).isFalse();
    }
}