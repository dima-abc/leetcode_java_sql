package org.leetcode.stepik;

/**
 * У вас есть переменная n которая содержит входные пользовательские данные.
 * Напишите код, который определяет, есть ли у числа n брэйк-пойнт.
 * "брэйк-пойнтом" называется такая точка в числе,
 * при которой число можно разделить на две "равные" части,
 * где сумма чисел слева и справа от этой точки равна.
 * Например, число 35190 можно разделить на 351 и 90,
 * потому что 3 + 5 + 1 = 9 и 9 + 0 = 9. А например у числа 555 такого брэйк-пойнта нет,
 * так как оно нельзя разделить на две равные части.
 */
public class Task514 {
    public boolean breakPoint(int num) {
        boolean result = false;
        int temp = num;
        int allSum = 0;
        while (temp > 0) {
            allSum += temp % 10;
            temp /= 10;
        }
        if (allSum % 2 != 0) {
            return result;
        } else {
            int anySum = 0;
            temp = num;
            while (temp > 0) {
                int i = temp % 10;
                anySum += i;
                allSum -= i;
                if (anySum == allSum) {
                    return true;
                }
                temp /= 10;
            }
        }
        return result;
    }
}
