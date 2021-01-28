# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: TreeNode) -> bool:
        nodes = []
        self._isValidBST(root, nodes)
        return sorted(nodes) == nodes and len(nodes) == len(set(nodes))
        
    def _isValidBST(self, root, nodes):
        if root:
            self._isValidBST(root.left, nodes)
            nodes.append(root.val)
            self._isValidBST(root.right, nodes)
