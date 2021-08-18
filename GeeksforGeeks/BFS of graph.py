#User function Template for python3

class Solution:
    
    #Function to return Breadth First Traversal of given graph.
    def bfsOfGraph(self, V, adj, source=0):
        # code here
        from collections import deque
        
        queue = deque([source])
        visited = {source}
        bfs = []
        
        while queue:
            current = queue.popleft()
            bfs.append(current)
            
            for neighbor in adj[current]:
                if neighbor not in visited:
                    queue.append(neighbor)
                    visited.add(neighbor)
        return bfs

#{ 
#  Driver Code Starts


if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		V, E = map(int, input().split())
		adj = [[] for i in range(V)]
		for _ in range(E):
			u, v = map(int, input().split())
			adj[u].append(v)
		ob = Solution()
		ans = ob.bfsOfGraph(V, adj)
		for i in range(len(ans)):
		    print(ans[i], end = " ")
		print()
        

# } Driver Code Ends
