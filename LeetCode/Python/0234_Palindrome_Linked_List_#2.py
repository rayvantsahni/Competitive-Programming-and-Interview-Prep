# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        if not head or not head.next:  # if list has no nodes or one node it is a palindrome
            return True
        
        slow = fast = head
        
        # iterating over the linked list to get the middle node so that we can split the linked list and reverse the second half to iterate over both halves simultaneously
        while fast.next and fast.next.next:  # two conditions for two cases i.e, when number of nodes is even and when they are odd
            slow = slow.next
            fast = fast.next.next
            
        left_head = head  # the head node of the first half of the list
        right_head = self.reverseLinkedList(slow.next)  # the head of the second half of the array (which we reversed)
        
        # we iterating over nodes of both the halves of the list at the same time and check for the necessary palindrome conditions
        while left_head and right_head:  # only iterate until both the list have elements; so, if one of the halves has one node extra, we ignore that node because that would have been middle node of the original list which would common from both sides hence doesn't really affect the outcome of the list being a palindrome
            if left_head.val != right_head.val:  # comparing corresponding nodes
                return False
            left_head = left_head.next
            right_head = right_head.next
        return True
    
    
    def reverseLinkedList(self, head):
        if not head or not head.next:
            return head
        
        current_node = head
        next_node = head
        previous_node = None
        
        while current_node:
            next_node = current_node.next
            current_node.next = previous_node
            previous_node = current_node
            current_node = next_node
            
        return previous_node
