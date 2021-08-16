# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def is_leaf(self, root):
        return root and not root.left and not root.right
        
    def sumOfLeftLeaves(self, root: Optional[TreeNode], is_left=False) -> int:
        if not root:
            return 0
        if self.is_leaf(root) and is_left:
            return root.val
        return self.sumOfLeftLeaves(root.left, True) + self.sumOfLeftLeaves(root.right, False)
