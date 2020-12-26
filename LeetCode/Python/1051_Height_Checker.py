class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        sorted_heights = sorted(heights)
        
        count = 0
        for student1, student2 in zip(heights, sorted_heights):
            if student1 != student2:
                count += 1
            
        return count
