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
        
        if root.val == target:
            return root
        
        if target > root.val and root.right:
            return self.searchBST(root.right, target)
        
        if target < root.val and root.left:
            return self.searchBST(root.left, target)
        
        else:
            return 
