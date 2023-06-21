package org.leetcode.e1to100.e13romantointeger;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * LeetCode.com
 * ProblemList
 * 13. Roman to Integer TEST
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 21.06.2023
 */
class SolutionRomanToIntegerTest {
    private final SolutionRomanToInteger roman = new SolutionRomanToInteger();

    @Test
    void whenExample1InputIIIThenReturn3() {
        var actual = roman.romanToInt("III");
        var expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenExample2InputLVIIIThenReturn58() {
        var actual = roman.romanToInt("LVIII");
        var expected = 58;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenExample3InputMCMXCIVThenReturn1994() {
        var actual = roman.romanToInt("MCMXCIV");
        var expected = 1994;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenByIndiaExample1InputIIIThenReturn3() {
        var actual = roman.romanToIntByIndia("III");
        var expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenByIndiaExample2InputLVIIIThenReturn58() {
        var actual = roman.romanToIntByIndia("LVIII");
        var expected = 58;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenByIndiaExample3InputMCMXCIVThenReturn1994() {
        var actual = roman.romanToIntByIndia("MCMXCIV");
        var expected = 1994;
        assertThat(actual).isEqualTo(expected);
    }
}