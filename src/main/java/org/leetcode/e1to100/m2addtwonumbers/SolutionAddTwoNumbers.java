package org.leetcode.e1to100.m2addtwonumbers;

/**
 * LeetCode.com
 * ProblemList
 * 2. Add Two Numbers
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 23.06.2023
 */
public class SolutionAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode temp = null;

        int tens = 0;

        while (l1 != null || l2 != null) {
            int sum = tens;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(sum % 10);

            tens = sum / 10;

            if (temp == null) {
                result = node;
                temp = result;
            } else {
                temp.next = node;
                temp = temp.next;
            }

        }
        if (tens > 0) {
            temp.next = new ListNode(tens);
        }
        return result;
    }
}
