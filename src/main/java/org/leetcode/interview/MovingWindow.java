package org.leetcode.interview;

/**
 * LeetCode.com
 * ProblemList
 * Скользящее окно
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 27.03.2024
 */
public class MovingWindow {

    public int getMaxSetSize(int[] arr) {
        int maxSetSize = 0;
        int start = 0;
        int end = 0;
        while (end < arr.length) {
            if (arr[end] == 0) {
                int setSize = end - start;
                maxSetSize = Math.max(maxSetSize, setSize);
                start = end + 1;
            }
            end++;
        }
        return Math.max(maxSetSize, end - start);
    }

    /**
     * найти максималбную последовательность если можно один нолик заменить на единицу
     *
     * @param arr
     * @return
     */
    public int getMazSetSizeChangeOnZero(int[] arr) {
        int max = 0;
        int zeroIndex = -1;
        int star = -1;
        int end = 0;
        while (end < arr.length) {
            if (arr[end] == 0) {
                int setSize = end - star;
                max = Math.max(max, setSize);
                star = zeroIndex + 1;
                zeroIndex = end;
            }
            end++;
        }
        if (star == -1) {
            return arr.length;
        }
        return max;
    }

    /**
     * найти мимнимальный индекс с максимальной суммой в массиве.
     */
    public int getMaxSubArrayEndIndex(int[] arr) {
        int maxSum = 0;
        int curSum = 0;
        int endIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if (curSum > maxSum) {
                maxSum = curSum;
                endIndex = i;
            }
        }
        return endIndex;
    }
}
