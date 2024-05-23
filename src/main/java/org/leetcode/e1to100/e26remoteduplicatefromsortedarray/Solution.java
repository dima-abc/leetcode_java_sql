package org.leetcode.e1to100.e26remoteduplicatefromsortedarray;

/**
 * 26. Remove Duplicates from Sorted Array
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[result] != nums[i]) {
                nums[++result] = nums[i];
            }
        }
        result++;
        return result;
    }
}
