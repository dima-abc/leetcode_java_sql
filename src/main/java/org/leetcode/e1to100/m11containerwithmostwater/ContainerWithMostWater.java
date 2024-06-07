package org.leetcode.e1to100.m11containerwithmostwater;

/**
 * 11. Container With Most Water
 * <a href="https://leetcode.com/problems/container-with-most-water/description/">11. Container With Most Water</a>
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area = 0;
        while (i < j) {
            int min = Math.min(height[i], height[j]);
            area = Math.max(area, min * (j - i));
            while (i < j && height[i] <= min) {
                i++;
            }
            while (i < j && height[j] <= min) {
                j--;
            }
        }
        return area;
    }
}
