package org.leetcode.e1to100.e26remoteduplicatefromsortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = new int[]{1, 1, 2};
        int result = solution.removeDuplicates(nums);
        int expectedCount = 2;
        assertEquals(expectedCount, result);
    }

    @Test
    void test2() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = solution.removeDuplicates(nums);
        int expectedCount = 5;
        assertEquals(expectedCount, result);
    }
}