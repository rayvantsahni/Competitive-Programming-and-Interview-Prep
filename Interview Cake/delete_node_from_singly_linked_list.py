# https://www.interviewcake.com/question/cpp/delete-node?utm_source=weekly_email&utm_source=drip&utm_campaign=weekly_email&utm_campaign=Interview%20Cake%20Weekly%20Problem%20%23349:%20Delete%20Node&utm_medium=email&utm_medium=email

def delete_node(current_node):
    # Delete the input node from the linked list
    next_node = current_node.next
    next_node.value, current_node.value = current_node.value, next_node.value
    
    if current_node.next.next:
        current_node.next = current_node.next.next
    else:
        current_node.next = None
