# your task is to complete this function

'''
class node:
    def __init__(data):
        self.data = data
        self.next = None
'''

# function should return index to the any valid peak element
def findMid(head):
    # Code here
    # return the value stored in the middle node
    
    slow = fast = head
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        
    return slow.data


#{ 
#  Driver Code Starts
# Node Class    
class node:
    def __init__(self, val):
        self.data = val
        self.next = None
        
# Linked List Class
class Linked_List:
    def __init__(self):
        self.head = None
        self.tail = None

    def insert(self, val):
        if self.head == None:
            self.head = node(val)
            self.tail = self.head
        else:
            new_node = node(val)
            self.tail.next = new_node
            self.tail = self.tail.next

def createList(arr, n):
    lis = Linked_List()
    for i in range(n):
        lis.insert(arr[i])
    return lis.head

if __name__=='__main__':
    t = int(input())
    for i in range(t):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        head = createList(arr, n)
        print(findMid(head))




# } Driver Code Ends
