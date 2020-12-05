# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def getDecimalValue(self, head: ListNode) -> int:      
        binary_list = []
        
        current = head
        while current:
            binary_list.append(str(current.val))
            current = current.next
        
        return int("".join(binary_list), 2)
