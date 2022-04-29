package linkedList.simple;

import linkedList.ListNode;

/**
 * 环形链表
 *
 * @link {https://leetcode-cn.com/problems/linked-list-cycle/}
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {

        if (null == head){
            return false;
        }
        // 1.快慢指针
        ListNode fast = head.next;
        ListNode slow = head;

        // 2.逻辑-指针相遇有环
        while (fast != slow) {
            if (null == fast || null == fast.next) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
