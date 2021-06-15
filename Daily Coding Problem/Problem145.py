def reverse_in_pair(head):
    if not head or not head.next:
        return head

    first = head
    second = head.next

    while second:
        first.val, second.val = second.val, first.val
        first = first.next.next
        second = second.next.next

    return head