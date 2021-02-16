class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        d = {}
        good = 0
        
        for index, num in enumerate(nums):
            if d.get(num):
                d[num].append(index)
            else:
                d[num] = [index]
                
        for num in d:
            indices_length = len(d.get(num))
            
            if indices_length == 1 or indices_length == 2:
                good += indices_length - 1
            else:
                good += self._sum(indices_length)
        
        return good
            
            
    def _sum(self, n):
        return (n * (n - 1)) // 2
