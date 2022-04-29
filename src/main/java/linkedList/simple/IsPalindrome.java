package linkedList.simple;

import linkedList.ListNode;

import java.util.ArrayList;

/**
 * 回文链表
 *
 * @link {https://leetcode-cn.com/problems/palindrome-linked-list/}
 * TODO 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode curNode = head;

        while (null != curNode){
            arrayList.add(curNode.val);
            curNode = curNode.next;
        }

        int right = arrayList.size() - 1;
        int left = 0;
        while (left < right){
            if (arrayList.get(left) != arrayList.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
