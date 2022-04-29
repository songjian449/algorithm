package linkedList.simple;

import linkedList.ListNode;

import java.util.Objects;

/**
 * 合并两个有序链表
 *
 * @link {https://leetcode-cn.com/problems/reverse-linked-list/}
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // 1.新链表表头
        ListNode head = new ListNode(-1);
        ListNode cur = head;

        // 2.双指针
        ListNode first = list1;
        ListNode second = list2;

        // 3.逻辑-比较双指针指向的链表节点val
        while (null != first && null != second) {
            if (first.val < second.val) {
                cur.next = first;
                first = first.next;
            } else {
                cur.next = second;
                second = second.next;
            }
            cur = cur.next;
        }
        // 4.没有遍历完的链表直接断开并拼接到新链表尾
        cur.next = null == first ? second : first;
        return head.next;
    }
}
