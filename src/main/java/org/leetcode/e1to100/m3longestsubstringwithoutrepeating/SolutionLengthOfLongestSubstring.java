package org.leetcode.e1to100.m3longestsubstringwithoutrepeating;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode.com
 * ProblemList
 * 3. Longest Substring Without Repeating Characters
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 23.06.2023
 */
public class SolutionLengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int finish = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while (finish < s.length()) {
            char addC = s.charAt(finish);
            if (set.add(addC)) {
                finish++;
                max = Math.max(set.size(), max);
            } else {
                char remC = s.charAt(start++);
                set.remove(remC);
            }
        }
        return max;
    }
}

