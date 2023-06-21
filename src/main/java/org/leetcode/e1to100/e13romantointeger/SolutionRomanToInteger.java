package org.leetcode.e1to100.e13romantointeger;

import java.util.Map;

/**
 * LeetCode.com
 * ProblemList
 * 13. Roman to Integer
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 21.06.2023
 */
public class SolutionRomanToInteger {
    private final Map<Character, Integer> mapRoman = Map.ofEntries(
            Map.entry('I', 1),
            Map.entry('V', 5),
            Map.entry('X', 10),
            Map.entry('L', 50),
            Map.entry('C', 100),
            Map.entry('D', 500),
            Map.entry('M', 1000)
    );

    public int romanToInt(String s) {
        int result = 0;
        for (short i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()
                && mapRoman.get(s.charAt(i)) < mapRoman.get(s.charAt(i + 1))) {
                result += mapRoman.get(s.charAt(i + 1)) - mapRoman.get(s.charAt(i));
                i++;
                continue;
            }
            result += mapRoman.get(s.charAt(i));
        }
        return result;
    }
}
