def is_binary_search_tree(root):
    if not root or (not root.right and root.left):
        return True
        
    tree_inorder = inorder(root)
    
    for i in range(len(tree_inorder) - 1):
        if tree_inorder[i] > tree_inorder[i + 1]:
            return False
    return True
        
def inorder(root):
    inorder_list = []
    _inorder(root, inorder_list)
    return inorder_list
    
def _inorder(root, _list):
    if root:
        _inorder(root.left, _list)
        _list.append(root.value)
        _inorder(root.right, _list)
