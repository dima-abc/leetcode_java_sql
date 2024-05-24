package org.leetcode.e1to100.e21mergetwosortedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution21Test {
    private final Solution21 solution = new Solution21();

    @Test
    void test1() {
        ListNode l1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));
        ListNode l2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));
        ListNode result = solution.mergeTwoLists(l1, l2);
        ListNode expected = new ListNode(1,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(4))))));
        assertEquals(expected, result);
    }

    @Test
    void test2() {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode result = solution.mergeTwoLists(l1, l2);
        ListNode expected = new ListNode(0, new ListNode());
        assertEquals(expected, result);
    }

    @Test
    void test3() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode();
        ListNode result = solution.mergeTwoLists(l1, l2);
        ListNode expected = new ListNode(0, new ListNode());
        assertEquals(expected, result);
    }
}