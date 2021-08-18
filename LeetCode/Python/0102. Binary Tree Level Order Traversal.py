# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []
        
        from collections import deque
        
        queue = deque([root])
        levelOrder = []
        
        while queue:
            size = len(queue)
            currentLevel = []
            
            for _ in range(size):
                current = queue.popleft()
                currentLevel.append(current.val)
                
                if current.left:
                    queue.append(current.left)
                if current.right:
                    queue.append(current.right)
                    
            levelOrder.append(currentLevel)
        
        return levelOrder
