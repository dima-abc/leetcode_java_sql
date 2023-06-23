package org.leetcode.e1to100.m3longestsubstringwithoutrepeating;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * LeetCode.com
 * ProblemList
 * 3. Longest Substring Without Repeating Characters TEST
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 23.06.2023
 */
class SolutionLengthOfLongestSubstringTest {
    private final SolutionLengthOfLongestSubstring solution = new SolutionLengthOfLongestSubstring();

    @Test
    public void whenExample1ABCABCBBThen3() {
        var s = "abcabcbb";
        var expected = 3;
        var actual = solution.lengthOfLongestSubstring(s);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenExample2BBBBBThen1() {
        var s = "bbbbb";
        var expected = 1;
        var actual = solution.lengthOfLongestSubstring(s);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenExample3PWWKEWThen3() {
        var s = "pwwkew";
        var expected = 3;
        var actual = solution.lengthOfLongestSubstring(s);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenExample4Then1() {
        var s = " ";
        var expected = 1;
        var actual = solution.lengthOfLongestSubstring(s);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenExample5dvdfThen2() {
        var s = "dvdf";
        var expected = 3;
        var actual = solution.lengthOfLongestSubstring(s);
        assertThat(actual).isEqualTo(expected);
    }
}