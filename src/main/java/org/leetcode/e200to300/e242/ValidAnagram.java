package org.leetcode.e200to300.e242;

import java.util.Arrays;

/**
 * LeetCode.com
 * ProblemList
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 05.03.2024
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        int length = charsS.length;
        Arrays.sort(charsS);
        Arrays.sort(charsT);
        for (int i = 0; i < length; i++) {
            int endI = length - 1 - i;
            if (charsS[i] != charsT[i] || charsS[endI] != charsT[endI]) {
                return false;
            }
            if (i == endI) {
                break;
            }
        }
        return true;
    }
}
