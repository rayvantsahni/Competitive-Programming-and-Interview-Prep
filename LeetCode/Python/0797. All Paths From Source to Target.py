class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        all_paths = []
        self._allPathsSourceTarget(graph, 0, [0], all_paths)
        return all_paths
    
    def _allPathsSourceTarget(self, graph, source, current, all_paths):
        if source == len(graph) - 1:
            all_paths.append(current)
            return 
        
        neighbors = graph[source]
        for neighbor in neighbors:
            self._allPathsSourceTarget(graph, neighbor, current + [neighbor], all_paths)
