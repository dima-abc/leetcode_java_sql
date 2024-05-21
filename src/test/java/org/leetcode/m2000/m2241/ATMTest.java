package org.leetcode.m2000.m2241;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    @Test
    void test1() {
        ATM atm = new ATM();
        int[] deposit = new int[]{0, 0, 1, 2, 1};
        atm.deposit(deposit);
        int amount = 600;
        int[] result = atm.withdraw(amount);
        int[] expected = new int[]{0, 0, 1, 0, 1};
        assertArrayEquals(expected, result);
        int[] countExpected = new int[]{0, 0, 0, 2, 0};
        assertArrayEquals(countExpected, atm.getBanknoteCount());
    }

    @Test
    void test2() {
        ATM atm = new ATM();
        int[] deposit = new int[]{0, 1, 0, 1, 1};
        atm.deposit(deposit);
        int amount = 600;
        int[] result = atm.withdraw(amount);
        int[] expected = new int[]{-1};
        assertArrayEquals(expected, result);
        assertArrayEquals(deposit, atm.getBanknoteCount());
    }

    @Test
    void test3() {
        ATM atm = new ATM();
        int[] deposit = new int[]{0, 1, 0, 1, 1};
        atm.deposit(deposit);
        int amount = 550;
        int[] result = atm.withdraw(amount);
        int[] expected = new int[]{0, 1, 0, 0, 1};
        assertArrayEquals(expected, result);
        int[] countExpected = new int[]{0, 0, 0, 1, 0};
        assertArrayEquals(countExpected, atm.getBanknoteCount());
    }
}