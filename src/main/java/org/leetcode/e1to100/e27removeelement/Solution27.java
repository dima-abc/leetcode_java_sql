package org.leetcode.e1to100.e27removeelement;

/**
 * 27. Remove Element
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result++] = nums[i];
            }
        }
        return result;
    }
}
