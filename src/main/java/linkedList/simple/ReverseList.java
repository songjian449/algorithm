package linkedList.simple;

import linkedList.ListNode;

/**
 * 反转链表
 *
 * @link {https://leetcode-cn.com/problems/reverse-linked-list/}
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        // null->1->2->3->4->5
        ListNode pre = null;
        ListNode cur = head;

        while (null != cur) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }

        return pre;
    }
}
