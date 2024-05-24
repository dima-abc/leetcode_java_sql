package org.leetcode.e1to100.e27removeelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution27Test {
    private final Solution27 solution27 = new Solution27();


    @Test
    void test1() {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int expectK = 2;
        int[] expectArray = new int[]{2, 2, 2, 3};
        int actual = solution27.removeElement(nums, val);
        assertEquals(expectK, actual);
        assertArrayEquals(expectArray, nums);
    }

    @Test
    void test2() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int expectK = 5;
        int[] expectArray = new int[]{0, 1, 3, 0, 4, 0, 4, 2};
        int actual = solution27.removeElement(nums, val);
        assertEquals(expectK, actual);
        assertArrayEquals(expectArray, nums);
    }
}