class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        from collections import deque
        
        queue = deque([0])
        visited = {0}
        
        while queue:
            current = queue.popleft()
            visited.add(current)
            
            for neighbor in rooms[current]:
                if neighbor not in visited:
                    queue.append(neighbor)
        
        return len(visited) == len(rooms)
