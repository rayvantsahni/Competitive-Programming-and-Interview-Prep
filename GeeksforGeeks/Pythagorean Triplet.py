#User function Template for python3
class Solution:

	def checkTriplet(self, arr, n):
    	# code here
    	d = {}
    	for i, a in enumerate(arr):
    	    arr[i] = a * a
    	    d[arr[i]] = i
    	
    	for i in range(n):
    	    for j in range(i+1, n):
    	        _sum = arr[i] + arr[j]
    	        if _sum in d and d[_sum] != i and d[_sum] != j:
    	            return True
    	return False
    	

#{ 
#  Driver Code Starts
#Initial Template for Python 3



if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.checkTriplet(arr, n)
        if ans:
            print("Yes")
        else:
            print("No")
        tc -= 1

# } Driver Code Ends
