# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        if not head or not head.next:
            return False
        slow = fast = head
        
        while fast.next:
            slow = slow.next
            fast = fast.next.next
            if not fast:
                break
            if slow is fast:
                return True
        
        return False
