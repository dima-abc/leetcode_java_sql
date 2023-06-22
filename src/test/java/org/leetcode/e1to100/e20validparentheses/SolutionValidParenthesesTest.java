package org.leetcode.e1to100.e20validparentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * LeetCode.com
 * ProblemList
 * 20. Valid Parentheses TEST
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 22.06.2023
 */
class SolutionValidParenthesesTest {
    private final SolutionValidParentheses solution = new SolutionValidParentheses();

    @Test
    void whenExample1ThenTrue() {
        var s = "()";
        var actual = solution.isValid(s);
        assertThat(actual).isTrue();
    }

    @Test
    void whenExample2ThenTrue() {
        var s = "()[]{}";
        var actual = solution.isValid(s);
        assertThat(actual).isTrue();
    }

    @Test
    void whenExample3ThenTrue() {
        var s = "(]";
        var actual = solution.isValid(s);
        assertThat(actual).isFalse();
    }

    @Test
    void whenExample4ThenTrue() {
        var s = "{[]}";
        var actual = solution.isValid(s);
        assertThat(actual).isTrue();
    }

    @Test
    void whenExample5ThenTrue() {
        var s = "([)]";
        var actual = solution.isValid(s);
        assertThat(actual).isFalse();
    }
}