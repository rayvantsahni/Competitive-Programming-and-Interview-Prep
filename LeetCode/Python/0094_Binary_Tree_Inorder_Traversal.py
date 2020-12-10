# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        
        inorder_traversal_list = []
        self._inorderTraversal(root, inorder_traversal_list)
        return inorder_traversal_list
    
    def _inorderTraversal(self, currentNode, inorder_list):
        if currentNode:
            self._inorderTraversal(currentNode.left, inorder_list)
            inorder_list.append(currentNode.val)
            self._inorderTraversal(currentNode.right, inorder_list)
        
