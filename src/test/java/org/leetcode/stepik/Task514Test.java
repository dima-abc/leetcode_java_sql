package org.leetcode.stepik;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task514Test {
    private final Task514 task = new Task514();

    @Test
    void test1() {
        int num = 159780;
        boolean actual = task.breakPoint(num);
        assertTrue(actual);
    }

    @Test
    void test2() {
        int num = 112;
        boolean actual = task.breakPoint(num);
        assertTrue(actual);
    }

    @Test
    void test3() {
        int num = 10;
        boolean actual = task.breakPoint(num);
        assertFalse(actual);
    }

    @Test
    void test4() {
        int num = 343;
        boolean actual = task.breakPoint(num);
        assertFalse(actual);
    }
}