package org.leetcode.e1to100.e14longestcommonprefix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * LeetCode.com
 * ProblemList
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 22.06.2023
 */
class SolutionLongestCommonPrefixTest {
    private SolutionLongestCommonPrefix solution = new SolutionLongestCommonPrefix();

    @Test
    void whenHorizontalExample1ThenFL() {
        var strs = new String[]{"flower", "flow", "flight"};
        var expected = "fl";
        var actual = solution.longestCommonPrefixHorizontal(strs);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenHorizontalExample2ThenEmpty() {
        var strs = new String[]{"dog", "racecar", "car"};
        var actual = solution.longestCommonPrefixHorizontal(strs);

        assertThat(actual).isEmpty();
    }

    @Test
    public void whenHorizontalExample33ElThenFound() {
        String[] strs = {"стол", "стул", "столица"};
        String expected = "ст";
        var actual = solution.longestCommonPrefixHorizontal(strs);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenHorizontalExample44ElThenFound() {
        String[] strs = {"столовая", "стол", "столица", "столяр"};
        String expected = "стол";
        var actual = solution.longestCommonPrefixHorizontal(strs);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenHorizontalExample51ElThenFound() {
        String[] strs = {"столовая"};
        String expected = "столовая";
        var actual = solution.longestCommonPrefixHorizontal(strs);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenHorizontalExample63ElThenNotFound() {
        String[] strs = {"столовая", "стол", "апостол"};
        String expected = "";
        var actual = solution.longestCommonPrefixHorizontal(strs);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenVerticalExample1ThenFL() {
        var strs = new String[]{"flower", "flow", "flight"};
        var expected = "fl";
        var actual = solution.longestCommonPrefixVertical(strs);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenVerticalExample2ThenEmpty() {
        var strs = new String[]{"dog", "racecar", "car"};
        var actual = solution.longestCommonPrefixVertical(strs);

        assertThat(actual).isEmpty();
    }

    @Test
    public void whenVerticalExample33ElThenFound() {
        String[] strs = {"стол", "стул", "столица"};
        String expected = "ст";
        var actual = solution.longestCommonPrefixVertical(strs);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenVerticalExample44ElThenFound() {
        String[] strs = {"столовая", "стол", "столица", "столяр"};
        String expected = "стол";
        var actual = solution.longestCommonPrefixVertical(strs);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenVerticalExample51ElThenFound() {
        String[] strs = {"столовая"};
        String expected = "столовая";
        var actual = solution.longestCommonPrefixVertical(strs);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenVerticalExample63ElThenNotFound() {
        String[] strs = {"столовая", "стол", "апостол"};
        String expected = "";
        var actual = solution.longestCommonPrefixVertical(strs);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenVerticalExample6ElThenA() {
        String[] strs = {"ab", "a"};
        String expected = "a";
        var actual = solution.longestCommonPrefixVertical(strs);
        assertThat(actual).isEqualTo(expected);
    }
}