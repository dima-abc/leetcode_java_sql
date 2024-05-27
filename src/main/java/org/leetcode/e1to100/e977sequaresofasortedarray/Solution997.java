package org.leetcode.e1to100.e977sequaresofasortedarray;

public class Solution997 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int resultIndex = n - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[resultIndex] = nums[left] * nums[left];
                left++;
            } else {
                result[resultIndex] = nums[right] * nums[right];
                right--;
            }
            resultIndex--;
        }
        return result;
    }
}
