package org.leetcode.e1to100.m2addtwonumbers;

import java.util.Objects;

/**
 * LeetCode.com
 * ProblemList
 * 2. Add Two Numbers
 * Definition for singly-linked list.
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 23.06.2023
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
