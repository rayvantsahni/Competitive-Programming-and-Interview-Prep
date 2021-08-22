class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        from math import inf
        
        points.sort(key=lambda x: x[1])
        print(points)
        count = 0
        limits = [-inf, -inf]
        
        for point in points:
            if not self.isWithinLimits(point, limits):
                limits = point.copy()
                count += 1
        
        return count
    
    def isWithinLimits(self, point, limits):
        return (limits[0] <= point[0] <= limits[1]) or (limits[0] <= point[1] <= limits[1]) or (point[0] < limits[0] and point[1] > limits[1])
