# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def postorderTraversal(self, root: TreeNode) -> List[int]:
        postorder_traversal_list = []
        self._postorderTraversal(root, postorder_traversal_list)
        return postorder_traversal_list
    
    def _postorderTraversal(self, currentNode, postorder_list):
        if currentNode:
            self._postorderTraversal(currentNode.left, postorder_list)
            self._postorderTraversal(currentNode.right, postorder_list)
            postorder_list.append(currentNode.val)
