# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        if not root:
            return True
        return self._isSymmetric(root.left, root.right)
    
    def _isSymmetric(self, left, right):
        if not left and not right:
            return True
        elif left and right:
            return left.val == right.val and self._isSymmetric(left.left, right.right) and self._isSymmetric(left.right, right.left)
        else:
            return False
