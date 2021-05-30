class Solution:
    def intersection(self, arr1: List[int], arr2: List[int]) -> List[int]:
        arr1.sort()
        arr2.sort()
        i = 0
        j = 0
        intersections = set()
        
        while i < len(arr1) and j < len(arr2):
            if arr1[i] == arr2[j]:
                intersections.add(arr1[i])
                i += 1
                j += 1
            elif arr1[i] < arr2[j]:
                i += 1
            elif arr1[i] > arr2[j]:
                j += 1
        
        return intersections
