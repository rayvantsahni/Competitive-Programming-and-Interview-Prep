/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode middleNode(ListNode head) {
        if (head.next == null)
            return head;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (true){
            if (fast.next == null)
                return slow;
            if (fast.next.next == null)
                return slow.next;
            
            slow = slow.next;
            fast = fast.next.next;
        }
    }
}
