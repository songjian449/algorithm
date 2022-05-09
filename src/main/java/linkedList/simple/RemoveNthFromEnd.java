package linkedList.simple;

import linkedList.ListNode;

/**
 * 删除链表的倒数第 N 个结点
 *
 * @link {https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/}
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;

    }
}
