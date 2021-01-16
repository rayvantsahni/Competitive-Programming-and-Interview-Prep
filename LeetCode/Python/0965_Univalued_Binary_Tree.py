# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isUnivalTree(self, root: TreeNode) -> bool:
        if not root.left and not root.right:
            return True
        
        s = set()
        self._isUnivalTree(root, s)
        if len(s) == 1:
            return True
        
    def _isUnivalTree(self, root, s):
        if root:
            self._isUnivalTree(root.left, s)
            self._isUnivalTree(root.right, s)
            s.add(root.val)
            
