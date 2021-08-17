from collections import defaultdict

class Solution:
    def findCenter(self, edges: List[List[int]]) -> int:
        d = defaultdict(int)
        for edge in edges:
            d[edge[0]] += 1
            d[edge[1]] += 1
        
        n = len(d)
        for node in d:
            if d[node] == n - 1:
                return node
