package org.leetcode.e1to100.e1twosum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * LeetCode.com
 * ProblemList
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 20.06.2023
 */
class SolutionTwoSumTest {
    @Test
    public void whenExample1Nums2i7i11i15Target9Then0i1() {
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        var nums = new int[]{2, 7, 11, 15};
        int target = 9;
        var expected = new int[]{0, 1};
        var actual = solutionTwoSum.twoSum(nums, target);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenExample2Nums3i2i4Target6Then1i2() {
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        var nums = new int[]{3, 2, 4};
        int target = 6;
        var expected = new int[]{1, 2};
        var actual = solutionTwoSum.twoSum(nums, target);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenExample3Nums3i3Target6Then0i1() {
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        var nums = new int[]{3, 2, 4};
        int target = 6;
        var expected = new int[]{1, 2};
        var actual = solutionTwoSum.twoSum(nums, target);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenExample4Nums3i2i3Target6Then0i2() {
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        var nums = new int[]{3, 2, 3};
        int target = 6;
        var expected = new int[]{0, 2};
        var actual = solutionTwoSum.twoSum(nums, target);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenExample5Nums2i5i5i11Target10Then1i1() {
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        var nums = new int[]{2, 5, 5, 11};
        int target = 10;
        var expected = new int[]{1, 2};
        var actual = solutionTwoSum.twoSum(nums, target);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenOnExample1Nums2i7i11i15Target9Then0i1() {
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        var nums = new int[]{2, 7, 11, 15};
        int target = 9;
        var expected = new int[]{0, 1};
        var actual = solutionTwoSum.twoSumOn(nums, target);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenOnExample2Nums3i2i4Target6Then1i2() {
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        var nums = new int[]{3, 2, 4};
        int target = 6;
        var expected = new int[]{1, 2};
        var actual = solutionTwoSum.twoSumOn(nums, target);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenOnExample3Nums3i3Target6Then0i1() {
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        var nums = new int[]{3, 2, 4};
        int target = 6;
        var expected = new int[]{1, 2};
        var actual = solutionTwoSum.twoSumOn(nums, target);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenOnExample4Nums3i2i3Target6Then0i2() {
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        var nums = new int[]{3, 2, 3};
        int target = 6;
        var expected = new int[]{0, 2};
        var actual = solutionTwoSum.twoSumOn(nums, target);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenOnExample5Nums2i5i5i11Target10Then1i1() {
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        var nums = new int[]{2, 5, 5, 11};
        int target = 10;
        var expected = new int[]{1, 2};
        var actual = solutionTwoSum.twoSumOn(nums, target);

        assertThat(actual).isEqualTo(expected);
    }
}