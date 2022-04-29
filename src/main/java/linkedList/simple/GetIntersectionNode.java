package linkedList.simple;

import linkedList.ListNode;

import java.util.HashSet;

/**
 * 相交链表
 *
 * @link {https://leetcode-cn.com/problems/intersection-of-two-linked-lists/}
 * TODO 优化-你能否设计一个时间复杂度 O(m + n) 、仅用 O(1) 内存的解决方案？
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> listNodeSet = new HashSet<>();

        // 双指针
        ListNode aPointer = headA;
        ListNode bPointer = headB;

        while (null != aPointer) {
            listNodeSet.add(aPointer);
            aPointer = aPointer.next;
        }

        while (null != bPointer){
            if (!listNodeSet.add(bPointer)){
                return bPointer;
            }
            bPointer = bPointer.next;
        }
        return null;
    }
}
