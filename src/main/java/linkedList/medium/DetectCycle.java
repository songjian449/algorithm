package linkedList.medium;

import linkedList.ListNode;

import java.util.HashSet;

/**
 * 环形链表 II
 *
 * @link {https://leetcode.cn/problems/linked-list-cycle-ii/}
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {

        ListNode cur = head;

        HashSet<ListNode> hashSet = new HashSet<>();

        while (null != cur){

            if (hashSet.contains(cur)){
                return cur;
            }

            hashSet.add(cur);
            cur = cur.next;

        }

        return null;
    }
}
