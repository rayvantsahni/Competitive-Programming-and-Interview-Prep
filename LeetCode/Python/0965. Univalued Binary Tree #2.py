# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isUnivalTree(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True
        left = root.val == root.left.val and  self.isUnivalTree(root.left) if root.left else True
        right = root.val == root.right.val and self.isUnivalTree(root.right) if root.right else True
        return left and right
