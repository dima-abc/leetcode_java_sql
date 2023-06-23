package org.leetcode.e1to100.m2addtwonumbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * LeetCode.com
 * ProblemList
 * 2. Add Two Numbers test
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 23.06.2023
 */
class SolutionAddTwoNumbersTest {
    private final SolutionAddTwoNumbers solution = new SolutionAddTwoNumbers();

    /**
     * l1 = [2,4,3], l2 = [5,6,4]
     * Output [7,0,8]
     * Explanation = 342 + 465 = 807;
     */
    @Test
    public void whenExample1Then807() {
        var l1 = new ListNode(2,
                new ListNode(4,
                        new ListNode(3)));
        var l2 = new ListNode(5,
                new ListNode(6,
                        new ListNode(4)));
        var expected = new ListNode(7,
                new ListNode(0,
                        new ListNode(8)));
        var actual = solution.addTwoNumbers(l1, l2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenExample2Then0() {
        var l1 = new ListNode(0);
        var l2 = new ListNode(0);
        var expected = new ListNode(0);
        var actual = solution.addTwoNumbers(l1, l2);
        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * Output: [8,9,9,9,0,0,0,1]
     */
    @Test
    public void whenExample3Then89990001() {
        var l1 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9)))))));
        var l2 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9))));
        var expected = new ListNode(8,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(0,
                                                new ListNode(0,
                                                        new ListNode(0,
                                                                new ListNode(1))))))));
        var actual = solution.addTwoNumbers(l1, l2);
        assertThat(actual).isEqualTo(expected);
    }

    /**
     * Input: l1 = [9], l2 = [1,9,9,9,9,9,9,9,9,9]
     * Output: [0,0,0,0,0,0,0,0,0,0,1]
     */
    @Test
    public void whenExample4Then0() {
        var l1 = new ListNode(9);
        var l2 = new ListNode(1,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9,
                                                                        new ListNode(9,
                                                                                new ListNode(9))))))))));
        var expected = new ListNode(0,
                new ListNode(0,
                        new ListNode(0,
                                new ListNode(0,
                                        new ListNode(0,
                                                new ListNode(0,
                                                        new ListNode(0,
                                                                new ListNode(0,
                                                                        new ListNode(0,
                                                                                new ListNode(0,
                                                                                        new ListNode(1)))))))))));
        var actual = solution.addTwoNumbers(l1, l2);
        assertThat(actual).isEqualTo(expected);
    }

}