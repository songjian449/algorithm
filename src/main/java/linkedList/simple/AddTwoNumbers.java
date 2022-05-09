package linkedList.simple;

import linkedList.ListNode;

/**
 * 两数相加
 *
 * @link {https://leetcode-cn.com/problems/add-two-numbers/}
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resListNode = new ListNode(-1);
        ListNode curNode = resListNode;

        int carry = 0;
        while (null != l1 || null != l2){
            int l1Value = null == l1 ? 0 : l1.val;
            int l2Value = null == l2 ? 0 : l2.val;

            int sum = l1Value + l2Value;
            carry = sum > 9 ? 1 : 0;
            sum = sum % 10;

            curNode.next = new ListNode(sum);
            curNode = curNode.next;

        }

        if (null != l1){
            l1 = l1.next;
        }

        if (null != l2){
            l2 = l2.next;
        }

        if (1 == carry){
            curNode.next = new ListNode(carry);
        }
        return resListNode.next;
    }
}
