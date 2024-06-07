package org.leetcode.e1to100.m11containerwithmostwater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    private final ContainerWithMostWater container = new ContainerWithMostWater();

    @Test
    void test1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int actual = container.maxArea(height);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] height = {1, 1};
        int expected = 1;
        int actual = container.maxArea(height);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        int[] height = {1, 0, 0, 0, 0, 0, 0, 2, 2};
        int expected = 8;
        int actual = container.maxArea(height);
        assertEquals(expected, actual);
    }
}