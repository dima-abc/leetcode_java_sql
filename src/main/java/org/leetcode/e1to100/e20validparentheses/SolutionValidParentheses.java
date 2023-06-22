package org.leetcode.e1to100.e20validparentheses;

import java.util.Stack;

/**
 * LeetCode.com
 * ProblemList
 * 14. Longest Common Prefix
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 22.06.2023
 */
public class SolutionValidParentheses {
    private static final int[] BR = new int[256];

    static {
        BR[')'] = '(';
        BR['}'] = '{';
        BR[']'] = '[';
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.empty() && stack.peek() == BR[c]) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
