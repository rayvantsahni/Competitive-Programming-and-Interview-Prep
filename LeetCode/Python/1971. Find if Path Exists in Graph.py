class Solution:
    def validPath(self, n: int, edges: List[List[int]], start: int, end: int) -> bool:
        from collections import defaultdict
        
        graph = defaultdict(list)
        for source, dest in edges:
            graph[source].append(dest)
            graph[dest].append(source)
        
        stack = [start]
        visited = {start}
        
        while stack:
            current = stack.pop()
            visited.add(current)
            if current == end:
                return True
                
            for neighbor in graph[current]:
                if neighbor not in visited:
                    stack.append(neighbor)
                    
        return False
