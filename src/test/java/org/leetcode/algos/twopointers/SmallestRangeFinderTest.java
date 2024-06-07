package org.leetcode.algos.twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SmallestRangeFinderTest {
    private final SmallestRangeFinder finder = new SmallestRangeFinder();

    @Test
    public void whenFindSmallestRangeUniqueElementsThenReturnExpectedRange() {
        int[] nums = {1, 3, 5, 7, 9};
        int k = 3;
        int[] expected = {0, 2};
        int[] actual = finder.findSmallestRange(nums, k);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenFindSmallestRangeRepeatedElementsThenReturnsExpectedRange() {
        int[] nums = {1, 2, 3, 3, 5, 6, 7};
        int k = 4;
        int[] expectedRange = {3, 6};
        int[] actual = finder.findSmallestRange(nums, k);
        assertThat(actual).isEqualTo(expectedRange);
    }

    @Test
    public void whenNotFound() {
        int[] nums = {1, 2, 3, 3, 3};
        int k = 4;
        int[] expectedRange = null;
        int[] actual = finder.findSmallestRange(nums, k);
        assertThat(actual).isEqualTo(expectedRange);
    }

}