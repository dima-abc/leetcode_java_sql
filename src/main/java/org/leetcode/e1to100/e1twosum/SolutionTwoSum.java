package org.leetcode.e1to100.e1twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode.com
 * ProblemList
 * 1.Two Sum
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 20.06.2023
 */
public class SolutionTwoSum {
    /**
     * O(n^2)
     *
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    /**
     * O(n)
     *
     */
    public int[] twoSumOn(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (numMap.containsKey(key)) {
                return new int[]{numMap.get(key), i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
