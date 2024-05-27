package org.leetcode.e1to1000.e977sequaresofasortedarray;

import org.junit.jupiter.api.Test;
import org.leetcode.e1to100.e977sequaresofasortedarray.Solution997;

import static org.junit.jupiter.api.Assertions.*;

class Solution997Test {
    private final Solution997 solution997 = new Solution997();

    @Test
    void test1() {
        int[] input = {-7, -3, 2, 3, 11};
        int[] actual = solution997.sortedSquares(input);
        int[] expected = {4, 9, 9, 49, 121};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] actual = solution997.sortedSquares(input);
        int[] expected = {0, 1, 9, 16, 100};
        assertArrayEquals(expected, actual);
    }

}