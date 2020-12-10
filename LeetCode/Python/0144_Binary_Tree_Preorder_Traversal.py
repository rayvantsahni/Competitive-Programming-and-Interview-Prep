# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def preorderTraversal(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        
        preorder_traversal_list = []
        self._preorderTraversal(root, preorder_traversal_list)
        return preorder_traversal_list
    
    def _preorderTraversal(self, currentNode, inorder_list):
        if currentNode:
            inorder_list.append(currentNode.val)
            self._preorderTraversal(currentNode.left, inorder_list)
            self._preorderTraversal(currentNode.right, inorder_list)
