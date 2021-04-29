# function should return index to the any valid peak element
def findMid(head):
    # Code here
    # return the value stored in the middle node
    
    slow = fast = head
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        
    return slow.data
