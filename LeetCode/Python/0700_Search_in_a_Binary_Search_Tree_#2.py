# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def searchBST(self, root: TreeNode, target: int) -> TreeNode:
        if not root:
            return
        
        while root:
            if target == root.val:
                return root
            elif target > root.val:
                root = root.right
            else:
                root = root.left
            
        return
