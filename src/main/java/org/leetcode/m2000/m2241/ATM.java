package org.leetcode.m2000.m2241;

/**
 * 2241. Design an ATM Machine
 * https://leetcode.com/problems/design-an-atm-machine/
 */
public class ATM {
    private final int[] banknotes = new int[]{20, 50, 100, 200, 500};
    private final int[] banknoteCount = new int[5];

    public ATM() {
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < banknotesCount.length; i++) {
            this.banknoteCount[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] result = new int[5];
        for (int i = 4; i >= 0; --i) {
            if (banknoteCount[i] == 0) {
                continue;
            }
            result[i] = (int) Math.min(amount / banknotes[i], banknoteCount[i]);
            amount -= result[i] * banknotes[i];
        }
        if (amount > 0) {
            return new int[] {-1};
        }
        for (int i = 0; i < 5; ++i) {
            banknoteCount[i] -= result[i];
        }
        return result;
    }

    public int[] getBanknoteCount() {
        return banknoteCount;
    }
}
