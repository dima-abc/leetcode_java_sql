package org.leetcode.e1to100.e14longestcommonprefix;

/**
 * LeetCode.com
 * ProblemList
 * 14. Longest Common Prefix
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 22.06.2023
 */
public class SolutionLongestCommonPrefix {
    /**
     * Горизонтальный поиск
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefixHorizontal(String[] strs) {
        String rsl = strs[0];
        int subTo = rsl.length() - 1;
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(rsl) != 0) {
                rsl = rsl.substring(0, subTo--);
            }
            if (subTo == 0) {
                return "";
            }
        }
        return rsl;
    }

    /**
     * Вертикальный поиск
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefixVertical(String[] strs) {
        String rsl = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char stepChar = strs[0].charAt(i);
            for (String str : strs) {
                if (i == str.length() || stepChar != str.charAt(i)) {
                    return rsl;
                }
            }
            rsl = rsl + stepChar;
        }
        return rsl;
    }
}
